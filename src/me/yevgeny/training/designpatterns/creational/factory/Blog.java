package me.yevgeny.training.designpatterns.creational.factory;

/**
 * @author Yevgeny Kuznetsov
 */
public class Blog extends Website {

    /**
     * The concrete website creation, used by the factory.
     */
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
