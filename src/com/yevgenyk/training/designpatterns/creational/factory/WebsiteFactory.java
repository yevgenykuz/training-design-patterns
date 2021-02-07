package com.yevgenyk.training.designpatterns.creational.factory;

/**
 * This is the website factory. It uses concrete website implementation (blog or shop) to create new websites.
 *
 * @author Yevgeny Kuznetsov
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
