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
            case START:
                response = "Привет! :)\n\n" +
                        "Получи рандомную проверку, которую можно применить для написания тестовых сценариев!\n\n " +
                        "1. Жми " + APIASSERT + " для проверки API. \n " +
                        "2. Жми " + REGISTERFORMASSERT + " для проверки формы регистрации. \n " +
                        "3. Жми " + DOCUMENTATIONASSERT + " для проверки документации или технического задания\n" +
                        "- Жми " + INFO + " чтобы получить ссылки на полезные ресурсы для тестировщиков. \n" +
                        "- Жми " + CAT + " для получения картинки случайного котика.";
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
            case INFO:
                response = "http://proglang.su/java/ курс по Java Core";
                break;
            case CAT:
                response = "Котика пока неть :c";
                break;
            default:
                response = DEFAULT;
                System.out.println("The user wrote an incorrect message : " + textMsg);
                break;
        }

        return response;
    }
}
