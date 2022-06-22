package com.example.telegramBotTesting.TestCaseAssert;

public interface BaseAssert {
    default void fillRegister(){};
    default String getAssert(){
        return null;
    };

}
