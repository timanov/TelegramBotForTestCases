package com.example.telegramBotTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class TelegramBotTestingApplication {

	static Storage storage;

	public static void main(String[] args) {

		SpringApplication.run(TelegramBotTestingApplication.class, args);

		try {
			TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
			telegramBotsApi.registerBot(new Bot());
		} catch (
				TelegramApiException e) {
			e.printStackTrace();
		}
	}
}
