package me.yevgeny.training.designpatterns.creational.factory;

/**
 * @author Yevgeny Kuznetsov
 */
public class FactoryDemo {

    public static void main(String[] args) {
        // a blog website:
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(website.getPages());

        // a shop website
        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(website.getPages());
    }
}
