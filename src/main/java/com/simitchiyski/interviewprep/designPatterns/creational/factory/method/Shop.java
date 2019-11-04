package com.simitchiyski.interviewprep.designPatterns.creational.factory.method;

import com.simitchiyski.interviewprep.designPatterns.creational.factory.method.pages.CartPage;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.method.pages.ItemPage;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.method.pages.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }

}
