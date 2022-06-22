import Controller.ControllerForCase;
import Feature.ParserCitaty;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import static Controller.ControllerForCase.*;

public class Bot extends TelegramLongPollingBot {
    final private String BOT_TOKEN = "5532935508:AAHYxI5beyRIaCPektSyQHReqpok6l-GncY";
    final private String BOT_NAME = "MishkaCitatyBot";
    Storage storage;
    ParserCitaty parserCitaty;
    int value;


    Bot()
    {
        storage = new Storage();
    }

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()){
            Message inMess = update.getMessage();
            String chatId = inMess.getChatId().toString();
            String response = parseMessage(inMess.getText());
            SendMessage outMess = new SendMessage();

            // Добавляем в наше сообщение id чата а также ответ
            outMess.setChatId(chatId);
            outMess.setText(response);

            //Отправка в чат
            try {
                execute(outMess);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private String parseMessage(String textMsg) {
        String response;

        switch (textMsg) {
            case START: case MENU:
                response = "Привет! :)\n\n" +
                        "Бот был создан для полезной информации для тестировщиков в своей сфере, " +
                        "чтобы находить больше полезных дефектов и приносить пользу команде\n\n" +
                        "Получи рандомную проверку, которую можно применить для написания тестовых сценариев!\n\n " +
                        "1. Жми " + APIASSERT + " для проверки API.\n " +
                        "2. Жми " + REGISTERFORMASSERT + " для проверки формы регистрации.\n " +
                        "3. Жми " + DOCUMENTATIONASSERT + " для проверки документации или технического задания.\n" +
                        "4. Жми " + AUTOTESTINFORMATION + " для получении информации по автотестам.\n"
                        + "\n" +
                        "Дополнительные интересные штуки для айтишника:\n"
                        + "\n" +
                        "- Жми " + TESTINFO + " чтобы открыть меню: \"Список знаний для тестировщика\"\n" +
                        "- Жми " + INFO + " чтобы получить ссылки на полезные ресурсы для тестировщиков.\n" +
                        "- Жми " + CAT + " для получения картинки случайного котика.\n" +
                        "- Жми " + CITATYPROGRAMMING + " для получения случайно цитаты по программированию" +
                        "- Жми " + VICTORINATESTING + " чтобы поиграть в викторину по тестированию";
                break;
            case APIASSERT:
                response = String.valueOf(storage.apiTestValue.getAssert());
                break;
            case REGISTERFORMASSERT:
                response = String.valueOf(storage.registerAsseert.getAssert());
                break;
            case DOCUMENTATIONASSERT:
                response = String.valueOf(storage.documentationAssert.getAssert());
                break;
            case AUTOTESTINFORMATION:
                response = "Тут должна быть информация по автотестам";
                break;
            case TESTINFO:
                response = "1. Шаблон чек-листа.\n" +
                           "2. Шаблон тест-кейса.\n" +
                           "3. Виды тестирования.\n" +
                           "4. Самые частые дефекты в UI.\n" +
                           "5. Самые частые дефекты в Backend.\n" +
                           "6. Нажать на " + MENU + "чтобы вернуться в главное меню";
                break;
            case INFO:
                response = "http://proglang.su/java/ курс по Java Core";
                break;
            case CAT:
                response = "Котика пока неть :c";
                break;
            case CITATYPROGRAMMING:
                response = parserCitaty.getRandQuote();
                break;
            case VICTORINATESTING:
                response = "Туть будет викторина. Нужно будет выбрать ответ, если всё ок - записывается 1 балл." +
                           "Можно сделать тоже самое и для программирования, будет очень прикольно. Рандомная задача будет";
                break;
            case GENERATESTEPFORCASE:
                if (storage.documentationAssert.getValue() == 0) {
                    response = "Сначала укажи выберите тип проверок, нажми " + MENU + " чтобы попасть в главное меню.";
                } else {
                    response = String.valueOf(storage.documentationAssert.getTestStepForCase());
                }
                break;
            case GENERATESTEPFORAPI:
                if (storage.apiTestValue.getValue() == 0) {
                    response = "Сначала укажи выберите тип проверок, нажми " + MENU + " чтобы попасть в главное меню.";
                } else {
                    try{
                        value = storage.apiTestValue.getValue();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    response = generatorTestStep(String.valueOf(storage.apiTestValue.getArray().get(value - 1)),
                            "\n" + storage.apiTestValue.getOneAssert(), ControllerForCase.message(DOCUMENTATIONASSERT));
                }
                break;
            default:
                response = DEFAULT;
                System.out.println("The user wrote an incorrect message : " + textMsg);
                break;
        }

        return response;
    }
}
