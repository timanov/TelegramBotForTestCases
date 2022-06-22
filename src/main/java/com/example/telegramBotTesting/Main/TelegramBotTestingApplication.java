package com.example.telegramBotTesting.Main;

import com.example.telegramBotTesting.telegram_bot.Bot;
import com.example.telegramBotTesting.telegram_bot.Storage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
@ComponentScan(basePackages = { "com.*"})
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
