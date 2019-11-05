package com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.moviePrinter;


import com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.Detail;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.advanced.Printer;

import java.util.ArrayList;
import java.util.List;

public final class MoviePrinter extends Printer {

    private final Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));

        return details;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }

}
