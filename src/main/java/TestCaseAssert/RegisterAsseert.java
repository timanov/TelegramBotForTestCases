package TestCaseAssert;


import java.util.ArrayList;

public class RegisterAsseert {
    private final String ONE = "1. Проверь на максимальное кол-во символов";
    private final String TWO = "2. Заполнение логина и пароля (некорректные значения).";
    private final String THREE = "3. После нажатия на кнопку Отправить происходит отправка формы при корректном сценарии.";
    private final String FOUR = "4. После нажатия на кнопку Отправить происходит отправка формы при корректном сценарии.";
    private final String FIVE = "5. Письмо отправляется на почту после регистрации.";
    private final String SIX = "6. Поля передаются в запросе.";
    private final String SEVEN = "7. Проверка валидации обязательных полей.";
    private final String EIGHT = "8. Проверка валидации обязательных полей.";
    private ArrayList<String> register;
    private int value = 0;

    public void fillRegister() {
        register = new ArrayList<>();
        register.add(ONE);
        register.add(TWO);
        register.add(THREE);
        register.add(FOUR);
        register.add(FIVE);
        register.add(SIX);
        register.add(SEVEN);
        register.add(EIGHT);
    }

    public String getAssert(){
        if (value == register.size()){
            value = 0;
        }
        String result = register.get(value);
        value++;
        return result;
    }

}
