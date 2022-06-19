import java.util.ArrayList;

public class Storage {
    private ArrayList<String> testingList;

    Storage() {
        testingList = new ArrayList<>();
        testingList.add("Проверь на максимальное кол-во символов");
        testingList.add("Проверь на минимальное кол-во символов");
    }

    String getAssert(){
        // Получаем случайную проверку в интервале от 0 до самого большого индекса
        int randValue = (int) (Math.random() * testingList.size());
        // Из коллекции получаем проверку со случайном индексом и возвращаем ее
        return testingList.get(randValue);
    }
}
