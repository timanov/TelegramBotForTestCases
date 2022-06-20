package TestCaseAssert;


import java.util.ArrayList;

public class ApiTestValue {
    private static final String ONE = "1. Потыкай на 500 ошибки.";
    private static final String TWO = "2. Укажи пустое тело";
    private static final String THREE = "3. Укажи другой запрос GET вместо POST";
    private static final String FOUR = "4. Укажи почти корректное тело, но исправь что-то";
    private static final String FIVE = "5. Укажи пустой токен";
    private static final String SIX = "6. Проверь заголовки ответа";
    private static final String SEVEN = "7. Проверь граничные значения";
    private static final String EIGHT = "8. Если передача binary, то передай некорректный";
    private static final String NINE = "9. Проверь задержку ответа, сделай побольше и проверь, что на фронтенде";
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
