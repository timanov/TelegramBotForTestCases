package com.example.telegramBotTesting.telegram_bot.TestCaseAssert;

import com.example.telegramBotTesting.telegram_bot.Controller.ControllerForCase;

import java.util.ArrayList;

import static com.example.telegramBotTesting.telegram_bot.Controller.ControllerForCase.DOCUMENTATIONASSERT;
import static com.example.telegramBotTesting.telegram_bot.Controller.ControllerForCase.GENERATESTEPFORCASE;

public class DocumentationAssert implements BaseAssert{
    private final String ONE = "1. User story - небольшая изолированная единица функцоинальности, " +
            "которую можно продемонстрировать.";
    private final String TWO = "2. User story написана в формате Как <роль пользователя>, я хочу <что-то>, " +
            "чтобы <цель>.";
    private final String THREE = "3. Ticket подходит к целям спринта.";
    private final String FOUR = "4. Описание функциональности понятно (например, нет неизвестных терминов, сленга.";
    private final String FIVE = "5. Acceptance criteria тестируемы (например, система должны работать стабильно весь год" +
            "или интерфейс должен быть удобный - не тестируемые критерии.";
    private final String SIX = "6. Функциональность не зависит от другой функциональности в спринте (лбио зависимость указана).";
    private final String SEVEN = "7. Требования к новому интерфейсу обозначены.";
    private final String EIGHT = "8. Функциональность приоритезирована.";
    private final String NINE = "9. Новый функционал не противоречит, согласуется с существующим ранее.";

    private ArrayList<String> documentation;
    private int value = 0;

    @Override
    public void fillRegister() {
        documentation = new ArrayList<>();
        documentation.add(ONE);
        documentation.add(TWO);
        documentation.add(THREE);
        documentation.add(FOUR);
        documentation.add(FIVE);
        documentation.add(SIX);
        documentation.add(SEVEN);
        documentation.add(EIGHT);
        documentation.add(NINE);
    }
    @Override
    public String getAssert(){
        if (value == documentation.size()){
            value = 0;
        }
        String result = documentation.get(value)
                + ControllerForCase.message(DOCUMENTATIONASSERT)
                + ControllerForCase.messageGeneratorStep(GENERATESTEPFORCASE);
        value++;
        return result;
    }

    public String getTestStepForCase() {
        String resultStepForCase = "Проверка:\n" + documentation.get(value - 1) + "\n\nСоздан шаг для тест-кейса: " +
                "\n\n- Проверить содержимое User-Story, содержит роль и пользователя."
                + "\nОжидаемый результат: Требование выполняется."
                + ControllerForCase.message(DOCUMENTATIONASSERT);
        return resultStepForCase;
    }

    public int getValue(){
        return this.value;
    }

}
