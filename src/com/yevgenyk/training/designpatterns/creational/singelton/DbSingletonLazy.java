package com.yevgenyk.training.designpatterns.creational.singelton;

/**
 * This is the singleton that can be created only once.
 * <p>
 * It is created lazily, only when we use it. It is <b>not</b> thread safe
 *
 * @author Yevgeny Kuznetsov
 */
public class DbSingletonLazy {

    private static DbSingletonLazy instance = null;

    private DbSingletonLazy() {
    }

    public static DbSingletonLazy getInstance() {
        if (null == instance) {
            instance = new DbSingletonLazy();
        }
        return instance;
    }
}
