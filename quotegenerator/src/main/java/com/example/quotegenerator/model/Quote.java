package com.example.quotegenerator.model;

public class Quote {
    private Long id;
    private  String text;
    private String author;
    private String category;

    public Quote(){
    }

    public Quote(Long id, String text, String author, String category) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.category = category;
    }

}
