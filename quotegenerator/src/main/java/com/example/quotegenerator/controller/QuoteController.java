package com.example.quotegenerator.controller;

import com.example.quotegenerator.service.QuoteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

@CrossOrigin(origins = "*")
public class QuoteController {
    private final QuoteService quoteService;

    // Constructor Injection
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }
}
