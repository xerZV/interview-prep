package com.simitchiyski.interviewprep.designPatterns.creational.prototype.v1;

import java.util.HashMap;
import java.util.Map;

public final class Registry {
    private static final Registry INSTANCE = new Registry();

    private Map<ItemType, Item> items = new HashMap<ItemType, Item>();

    private Registry() {
        loadItems();
    }

    public static Registry getInstance() {
        return INSTANCE;
    }

    public Item createItem(ItemType type) {
        Item item = null;

        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    public Movie createMovie() {
        Movie movie = null;

        try {
            movie = (Movie) (items.get(ItemType.MOVIE)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return movie;
    }

    public Book createBook() {
        Book book = null;

        try {
            book = (Book) (items.get(ItemType.BOOK)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return book;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put(ItemType.MOVIE, movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        items.put(ItemType.BOOK, book);
    }

    public static enum ItemType {
        MOVIE,
        BOOK
    }
}
