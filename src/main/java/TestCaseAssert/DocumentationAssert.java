package TestCaseAssert;

import java.util.ArrayList;

public class DocumentationAssert {
    private final String ONE = "1. User story - небольшая изолированная единица функцоинальности" +
            "которую можно продемонстрировать";
    private final String TWO = "2. User story написана в формате Как <роль пользователя>, я хочу <что-то>, +" +
            "чтобы <цель>";
    private final String THREE = "3. Ticket подходит к целям спринта";
    private final String FOUR = "4. Описание функциональности понятно (например, нет неизветсных терминов, сленга";
    private final String FIVE = "5. Acceptance criteria тестируемы (например, система должны работать стабильно весь год" +
            "или интерфейс должен быть удобный - не тестируемые критерии";
    private final String SIX = "6. Функциональность не зависит от другой функциональности в спринте (лбио зависимость указана)";
    private final String SEVEN = "7. Требования к новому интерфейсу обозначены";
    private final String EIGHT = "8. Функциональность приоритезирована";
    private final String NINE = "9. Новый функционал не противоречит, согласуется с существующим ранее";
    private ArrayList<String> documentation;
    private int value = 0;


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

    public String getAssertDocumentation(){
        if (value == documentation.size()){
            value = 0;
        }
        String result = documentation.get(value);
        value++;
        return result;
    }
}