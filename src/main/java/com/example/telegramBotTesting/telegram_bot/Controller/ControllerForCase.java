package com.example.telegramBotTesting.telegram_bot.Controller;

public class ControllerForCase {

    public static final String APILINK = "/ApiLink";

    public static final String START = "/start";

    public static final String MENU = "/menu";

    public static final String APIASSERT = "/ApiAssert";

    public static final String REGISTERFORMASSERT = "/RegisterFormAssert";

    public static final String DOCUMENTATIONASSERT = "/DocumentationAssert";

    public static final String AUTOTESTINFORMATION = "/InfoAutotest";

    public static final String JAVAINFORMATIONCORE = "/JavaInformationCore";

    public static final String VICTORINATESTING = "/VictorinaTesting";

    public static final String CAT = "/Cat";

    public static final String INFO = "/Info";

    public static final String TESTINFO = "/TestInfo";

    public static final String CITATYPROGRAMMING = "/CitatyForProgramming";

    public static final String DEFAULT = "Сообщение не распознано, нажми " +
            MENU + " для получения начального окна.";

    public static final String GENERATESTEPFORCASE = "/GenerateStepForCase";
    public static final String GENERATESTEPFORAPI = "/GenerateStepForApiCase";

    private static String result;

    /**
     * @param path - нужно указать функцию которая вызывается в боте(пример /api)
     * @return сообщение со следующей проверкой
     */
    public static String message(String path) {
        result = "\n\nНажми " + path + " чтобы получить следующую проверку.";
        return result;
    }

    /**
     * @param path - нужно указать функцию которая вызывается в боте(пример /api)
     * @return сгенерированный шаг в тест-кейс
     */
    public static String messageGeneratorStep(String path) {
        result = "\n\nНажми " + path + " для генерации шага для вставки в тест-кейс.";
        return result;
    }

    /**
     * @param assertGet  - Проверка, которую мы проверяем. (apiAssert.get(value - 1)
     * @param assertStep - Сам шаг тест-кейса с ожидаемым результатом.
     * @param message    - Сообщение, что двигаемся дальше. (ControllerForCase.message(DOCUMENTATIONASSERT)
     * @return Готовый тестовый шаг, который можно внедрить в тест-кейс.
     */
    public static String generatorTestStep(String assertGet, String assertStep, String message) {
        result = "Проверка:\n" + assertGet + "\n\nСоздан шаг для тест-кейса:\n"
                + assertStep
                + message;
        return result;
    }
}
