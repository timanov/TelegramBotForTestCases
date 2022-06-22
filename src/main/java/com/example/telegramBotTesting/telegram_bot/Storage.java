package com.example.telegramBotTesting.telegram_bot;

import com.example.telegramBotTesting.telegram_bot.TestCaseAssert.ApiTestValue;
import com.example.telegramBotTesting.telegram_bot.TestCaseAssert.DocumentationAssert;
import com.example.telegramBotTesting.telegram_bot.TestCaseAssert.RegisterAsseert;

public class Storage {

    public RegisterAsseert registerAsseert = new RegisterAsseert();
    public ApiTestValue apiTestValue = new ApiTestValue();
    public DocumentationAssert documentationAssert = new DocumentationAssert();

    Storage() {
        apiTestValue.fillApi();
        registerAsseert.fillRegister();
        documentationAssert.fillRegister();

    }
}
