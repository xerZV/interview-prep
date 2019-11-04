package com.simitchiyski.interviewprep.designPatterns.creational.factory.method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WebsiteFactoryTest {

    @Test
    public void getWebsite() {
        Website blog = WebsiteFactory.createWebsiteOfType(WebsiteType.BLOG);
        assertEquals("[PostPage, AboutPage, CommentPage, ContactPage]", blog.toString());

        Website shop = WebsiteFactory.createWebsiteOfType(WebsiteType.SHOP);
        assertEquals("[CartPage, ItemPage, SearchPage]", shop.toString());
    }
}