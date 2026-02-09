package com.example.quotegenerator.service;

import com.example.quotegenerator.model.Quote;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class QuoteService {

    private List<Quote> quotes = new ArrayList<>();
    private Long nextId = 1L;
    private Random random = new Random();

    // Constructor - Initial quotes add karte hain
    public QuoteService() {
        initializeQuotes();
    }

    // Initial quotes
    private void initializeQuotes() {
        quotes.add(new Quote(nextId++,
                "The only way to do great work is to love what you do.",
                "Steve Jobs",
                "motivational"));

        quotes.add(new Quote(nextId++,
                "Success is not final, failure is not fatal.",
                "Winston Churchill",
                "motivational"));

        quotes.add(new Quote(nextId++,
                "Believe you can and you're halfway there.",
                "Theodore Roosevelt",
                "inspirational"));

        quotes.add(new Quote(nextId++,
                "Life is what happens when you're busy making other plans.",
                "John Lennon",
                "life"));

        quotes.add(new Quote(nextId++,
                "The purpose of our lives is to be happy.",
                "Dalai Lama",
                "life"));

        quotes.add(new Quote(nextId++,
                "Get busy living or get busy dying.",
                "Stephen King",
                "motivational"));

        quotes.add(new Quote(nextId++,
                "You only live once, but if you do it right, once is enough.",
                "Mae West",
                "life"));

        quotes.add(new Quote(nextId++,
                "In the end, we only regret the chances we didn't take.",
                "Lewis Carroll",
                "inspirational"));
    }

    // Get random quote
    public Quote getRandomQuote() {
        if (quotes.isEmpty()) {
            return null;
        }
        int index = random.nextInt(quotes.size());
        return quotes.get(index);
    }

    // Get all quotes
    public List<Quote> getAllQuotes() {
        return new ArrayList<>(quotes);
    }

    // Get quotes by category
    public List<Quote> getQuotesByCategory(String category) {
        return quotes.stream()
                .filter(quote -> quote.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    // Add new quote
    public Quote addQuote(Quote quote) {
        quote.setId(nextId++);
        quotes.add(quote);
        return quote;
    }

    // Get quote by ID
    public Quote getQuoteById(Long id) {
        return quotes.stream()
                .filter(quote -> quote.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Delete quote
    public boolean deleteQuote(Long id) {
        return quotes.removeIf(quote -> quote.getId().equals(id));
    }

    // Get all categories
    public List<String> getAllCategories() {
        return quotes.stream()
                .map(Quote::getCategory)
                .distinct()
                .collect(Collectors.toList());
    }
}