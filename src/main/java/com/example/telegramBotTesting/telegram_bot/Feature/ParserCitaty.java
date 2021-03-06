package com.example.telegramBotTesting.telegram_bot.Feature;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class ParserCitaty {
    private final ArrayList<String> quoteList;

    ParserCitaty() {
        quoteList = new ArrayList<>();
        parser("https://ru.citaty.net/temy/programmirovanie/");
    }

    public String getRandQuote() {
        // Получаем случайно значение в интервале от 0 до самого большого индекса
        int randValue = (int) (Math.random() * quoteList.size());
        // Из коллекции получаем цитаты со случайным индексом и возвращаем ее
        return quoteList.get(randValue);
    }

    void parser(String strURL) {
        String className = "blockquote-text";
        Document doc = null;
        try {
            // Получаем документ нужной нам страницы
            doc = Jsoup.connect(strURL).maxBodySize(0).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Получаем группу объектов, обращаясь методом из Jsoup к определенному блоку
        assert doc != null;
        Elements elQuote = doc.getElementsByClass(className);

        // Достаем текст из каждого объекта поочеерди и добавляем в наше хранилище
        elQuote.forEach(el -> quoteList.add(el.text()));
    }

}
