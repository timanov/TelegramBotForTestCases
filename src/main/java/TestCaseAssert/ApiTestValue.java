package TestCaseAssert;


import java.util.ArrayList;

public class ApiTestValue {
    private final String ONE = "1. Потыкай на 500 ошибки.";
    private final String TWO = "2. Укажи пустое тело";
    private final String THREE = "3. Укажи другой запрос GET вместо POST";
    private final String FOUR = "4. Укажи почти корректное тело, но исправь что-то";
    private final String FIVE = "5. Укажи пустой токен";
    private final String SIX = "6. Проверь заголовки ответа";
    private final String SEVEN = "7. Проверь граничные значения";
    private final String EIGHT = "8. Если передача binary, то передай некорректный";
    private final String NINE = "9. Проверь задержку ответа, сделай побольше и проверь, что на фронтенде";
    private ArrayList<String> apiAssert;
    private int value = 0;

    public void fillApi() {
        apiAssert = new ArrayList<>();
        apiAssert.add(ONE);
        apiAssert.add(TWO);
        apiAssert.add(THREE);
        apiAssert.add(FOUR);
        apiAssert.add(FIVE);
        apiAssert.add(SIX);
        apiAssert.add(SEVEN);
        apiAssert.add(EIGHT);
        apiAssert.add(NINE);
    }

    public String getAssertApi(){
        if (value == apiAssert.size()){
            value = 0;
        }
        String result = apiAssert.get(value);
        value++;
        return result;
    }


}
