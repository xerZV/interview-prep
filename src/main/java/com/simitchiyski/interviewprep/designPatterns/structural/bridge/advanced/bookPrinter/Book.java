package com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.bookPrinter;

public final class Book {
    private String classification;
    private String numberOfPages;
    private String title;
    private String year;
    private String author;

    private Book() {
    }

    public Book(String classification, String numberOfPages, String title, String year, String author) {
        this.classification = classification;
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
