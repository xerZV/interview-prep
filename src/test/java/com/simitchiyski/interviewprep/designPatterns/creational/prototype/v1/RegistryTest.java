package com.simitchiyski.interviewprep.designPatterns.creational.prototype.v1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegistryTest {

    @Test
    public void createMovie() {
        Movie movie = Registry.getInstance().createMovie();
        movie.setTitle("Creational propotype pattern");
        movie.setRuntime("Runtime");
        assertEquals("Movie{runtime='Runtime', title='Creational propotype pattern', price=24.99, url='null'}", movie.toString());

        Movie anotherMovie = Registry.getInstance().createMovie();
        anotherMovie.setTitle("Creational propotype pattern 2nd edition");
        anotherMovie.setRuntime("Runtime 2nd edition");
        assertEquals("Movie{runtime='Runtime 2nd edition', title='Creational propotype pattern 2nd edition', price=24.99, url='null'}", anotherMovie.toString());
    }

    @Test
    public void createBook() {
        Book book = Registry.getInstance().createBook();
        book.setNumberOfPages(39);
        assertEquals("Book{numberOfPages=39, title='Basic Book', price=19.99, url='null'}", book.toString());

        Book anotherBook = Registry.getInstance().createBook();
        anotherBook.setNumberOfPages(49);
        assertEquals("Book{numberOfPages=49, title='Basic Book', price=19.99, url='null'}", anotherBook.toString());
    }
}