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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public void setID(Long aLong) {
    }
}
