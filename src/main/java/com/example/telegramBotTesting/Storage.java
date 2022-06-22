package com.example.telegramBotTesting;

import com.example.telegramBotTesting.TestCaseAssert.ApiTestValue;
import com.example.telegramBotTesting.TestCaseAssert.DocumentationAssert;
import com.example.telegramBotTesting.TestCaseAssert.RegisterAsseert;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Storage {

    RegisterAsseert registerAsseert = new RegisterAsseert();
    ApiTestValue apiTestValue = new ApiTestValue();
    DocumentationAssert documentationAssert = new DocumentationAssert();

    Storage() {
        apiTestValue.fillApi();
        registerAsseert.fillRegister();
        documentationAssert.fillRegister();

    }
}
