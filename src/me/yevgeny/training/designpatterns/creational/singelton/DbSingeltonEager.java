package me.yevgeny.training.designpatterns.creational.singelton;

/**
 * This is the singleton that can be created only once.
 * <p>
 * It is created eagerly, whether we use it or not.
 *
 * @author Yevgeny Kuznetsov
 */
public class DbSingeltonEager {
    private static DbSingeltonEager instance = new DbSingeltonEager();

    // The private constructor prevents "new DbSingeltonEager()" statements outside this class.
    private DbSingeltonEager() {
    }

    // This is the only way to access this object:
    public static DbSingeltonEager getInstance() {
        return instance;
    }
}
