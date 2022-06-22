package com.example.telegramBotTesting.telegram_bot.TestCaseAssert;

public interface BaseAssert {
    default void fillRegister(){};
    default String getAssert(){
        return null;
    };

}
