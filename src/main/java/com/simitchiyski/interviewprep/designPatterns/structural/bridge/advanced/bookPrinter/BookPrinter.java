package com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.bookPrinter;


import com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.Detail;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.Printer;

import java.util.ArrayList;
import java.util.List;

public final class BookPrinter extends Printer {

    private final Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Author", book.getAuthor()));
        details.add(new Detail("Title", book.getTitle()));
        details.add(new Detail("Year", book.getYear()));
        details.add(new Detail("Number of pages", book.getNumberOfPages()));

        return details;
    }

    @Override
    protected String getHeader() {
        return book.getClassification();
    }

}
