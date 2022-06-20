package Controller;

public class ControllerForCase {

    public static final String START = "/start";

    public static final String APIASSERT = "/ApiAssert";

    public static final String REGISTERFORMASSERT = "/RegisterFormAssert";

    public static final String DOCUMENTATIONASSERT = "/DocumentationAssert";

    public static final String AUTOTESTINFORMATION = "/InfoAutotest";

    public static final String CAT = "/Cat";

    public static final String INFO = "/Info";

    public static final String DEFAULT = "Сообщение не распознано, нажми " +
            START + " для получения начального окна.";

    public static final String GENERATESTEPFORCASE = "/GenerateStepForCase";
    public static final String GENERATESTEPFORAPI = "/GenerateStepForApiCase";

    /**
     *
     * @param path - нужно указать функцию которая вызывается в боте(пример /api)
     * @return сообщение со следующей проверкой
     */
    public static String message(String path) {
        String result = "\n\nНажми " + path + " чтобы получить следующую проверку.";
        return result;
    }

    /**
     *
     * @param path - нужно указать функцию которая вызывается в боте(пример /api)
     * @return сгенерированный шаг в тест-кейс
     */
    public static String messageGeneratorStep(String path) {
        String result = "\n\nНажми " + path + " для генерации шага для вставки в тест-кейс.";
        return result;
    }

    /**
     * @param assertGet - Проверка, которую мы проверяем. (apiAssert.get(value - 1)
     * @param assertStep - Сам шаг тест-кейса с ожидаемым результатом.
     * @param message - Сообщение, что двигаемся дальше. (ControllerForCase.message(DOCUMENTATIONASSERT)
     * @return Готовый тестовый шаг, который можно внедрить в тест-кейс.
     */
    public static String generatorTestStep(String assertGet, String assertStep, String message) {
        String result = "Проверка:\n" + assertGet + "\n\nСоздан шаг для тест-кейса:\n"
                + assertStep
                + message;
        return result;
    }
}
