package com.yevgenyk.training.designpatterns.creational.singelton;

/**
 * This is the singleton that can be created only once.
 * <p>
 * It is created eagerly, whether we use it or not.
 *
 * @author Yevgeny Kuznetsov
 */
public class DbSingletonEager {

    private static final DbSingletonEager instance = new DbSingletonEager();

    // The private constructor prevents "new DbSingletonEager()" statements outside this class.
    private DbSingletonEager() {
    }

    // This is the only way to access this object:
    public static DbSingletonEager getInstance() {
        return instance;
    }
}
