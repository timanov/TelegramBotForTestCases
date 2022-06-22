package com.example.telegramBotTesting.api.model;

public class Client {

    private final long id;
    private final String content;

    public Client (long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
