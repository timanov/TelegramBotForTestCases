package com.example.telegramBotTesting.api.model;

import lombok.Getter;

public class Testing {

    @Getter
    private final long id;

    @Getter
    private final String content;

    public Testing(long id, String content){
        this.id = id;
        this.content = content;
    }

}
