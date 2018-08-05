package me.yevgeny.training.designpatterns.creational.singelton;

/**
 * This is the singleton that can be created only once.
 * <p>
 * It is created lazily, only when we use it. It is <b>not</b> thread safe
 *
 * @author Yevgeny Kuznetsov
 */
public class DbSingeltonLazy {
    private static DbSingeltonLazy instance = null;

    private DbSingeltonLazy() {
    }

    public static DbSingeltonLazy getInstance() {
        if (null == instance) {
            instance = new DbSingeltonLazy();
        }
        return instance;
    }
}
