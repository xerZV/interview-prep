package com.simitchiyski.interviewprep.designPatterns.creational.factory.method;

import java.util.Objects;

public final class WebsiteFactory {
    private WebsiteFactory() {
    }

    public static Website createWebsiteOfType(WebsiteType siteType) {
        Objects.requireNonNull(siteType);

        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }

}
