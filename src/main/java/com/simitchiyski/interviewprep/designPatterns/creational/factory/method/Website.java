package com.simitchiyski.interviewprep.designPatterns.creational.factory.method;

import com.simitchiyski.interviewprep.designPatterns.creational.factory.method.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    final List<Page> pages = new ArrayList<>();

    Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite();

    @Override
    public String toString() {
        return pages.toString();
    }
}
