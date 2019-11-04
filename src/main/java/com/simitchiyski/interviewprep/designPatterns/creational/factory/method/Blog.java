package com.simitchiyski.interviewprep.designPatterns.creational.factory.method;

import com.simitchiyski.interviewprep.designPatterns.creational.factory.method.pages.AboutPage;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.method.pages.CommentPage;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.method.pages.ContactPage;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.method.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }

}
