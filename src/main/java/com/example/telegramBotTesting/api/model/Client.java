package com.example.telegramBotTesting.api.model;

import lombok.Getter;
import lombok.Setter;

public class Client {

    @Getter
    private final long id;

    @Getter
    private final String content;

    public Client (long id, String content) {
        this.id = id;
        this.content = content;
    }


}
