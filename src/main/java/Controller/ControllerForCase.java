package Controller;

public class ControllerForCase {

    public static final String START = "/start";

    public static final String APIASSERT = "/ApiAssert";

    public static final String REGISTERFORMASSERT = "/RegisterFormAssert";

    public static final String DOCUMENTATIONASSERT = "/DocumentationAssert";

    public static final String CAT = "/Cat";

    public static final String INFO = "/Info";

    public static final String DEFAULT = "Сообщение не распознано, нажми " +
            START + " для получения начального окна.";

    public static final String GENERATESTEPFORCASE = "/GenerateStepForCase";

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
}
