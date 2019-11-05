package com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.moviePrinter;

import com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.Formatter;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.HtmlFormatter;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.PrintFormatter;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.Printer;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.bookPrinter.Book;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.bookPrinter.BookPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void print() {
        Formatter htmlFormatter = new HtmlFormatter();
        Formatter printFormatter = new PrintFormatter();

        Movie movie = new Movie("Action", "2:15", "John Wick", "2014");
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);
        assertEquals("Action\n" +
                "Title:John Wick\n" +
                "Year:2014\n" +
                "Runtime:2:15\n", printedMaterial);

        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);
        assertEquals("<table><th>Classification</th><th>Action</th><tr><td>Title</td><td>John Wick</td></tr><tr><td>Year</td><td>2014</td></tr><tr><td>Runtime</td><td>2:15</td></tr></table>", htmlMaterial);

        System.out.println();
        Book book = new Book("Romance", "689", "Jimmy Blank", "1987", "Mr Steven Kohen");
        Printer bookPrinter = new BookPrinter(book);

        String bookPrintedMaterial = bookPrinter.print(printFormatter);
        System.out.println(bookPrintedMaterial);
        assertEquals("Romance\n" +
                "Author:Mr Steven Kohen\n" +
                "Title:Jimmy Blank\n" +
                "Year:1987\n" +
                "Number of pages:689\n", bookPrintedMaterial);

        String bookHtmlMaterial = bookPrinter.print(htmlFormatter);
        System.out.println(bookHtmlMaterial);
        assertEquals("<table><th>Classification</th><th>Romance</th><tr><td>Author</td><td>Mr Steven Kohen</td></tr><tr><td>Title</td><td>Jimmy Blank</td></tr><tr><td>Year</td><td>1987</td></tr><tr><td>Number of pages</td><td>689</td></tr></table>", bookHtmlMaterial);
    }
}