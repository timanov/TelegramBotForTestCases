import TestCaseAssert.RegisterFormValue;

import java.util.ArrayList;

public class Storage {
    private ArrayList<String> Line;
    RegisterFormValue registerFormValue = new RegisterFormValue();
    int value = 0;

    Storage() {
        Line = new ArrayList<>();
        Line.add("Проверь на максимальное кол-во символов");
        Line.add("Проверь на минимальное кол-во символов.");
        registerFormValue.fillRegister();

    }

    String getAssertLine(){
        // Получаем случайную проверку в интервале от 0 до самого большого индекса
        int randValue = (int) (Math.random() * Line.size());
        // Из коллекции получаем проверку со случайном индексом и возвращаем ее
        return Line.get(randValue);
    }




}
