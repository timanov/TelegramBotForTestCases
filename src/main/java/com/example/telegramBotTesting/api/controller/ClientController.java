package com.example.telegramBotTesting.api.controller;

import com.example.telegramBotTesting.api.model.Client;
import com.example.telegramBotTesting.api.model.Testing;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class ClientController {

    private static final String template = "Hello, %s";
    private static final String testingMessage = "Mishka, %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/client")
    public Client Client(@RequestParam(value="name", required = false, defaultValue = "World") String client) {
        return new Client(counter.incrementAndGet(),
                String.format(template, client));
    }

    @RequestMapping("/api/hello")
    public Testing testing(@RequestParam(value="name", required = false, defaultValue = "World") String testing) {
        return new Testing(counter.incrementAndGet(),
                String.format(template, testingMessage));
    }

}
