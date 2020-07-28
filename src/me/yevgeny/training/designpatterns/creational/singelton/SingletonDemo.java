package me.yevgeny.training.designpatterns.creational.singelton;

/**
 * @author Yevgeny Kuznetsov
 */
public class SingletonDemo {

    public static void main(String[] args) {
        // both DbSingletonEager objects will be stored at the same address:
        DbSingletonEager eagerInstance = DbSingletonEager.getInstance();
        System.out.println(eagerInstance);

        DbSingletonEager anotherEagerInstance = DbSingletonEager.getInstance();
        System.out.println(anotherEagerInstance);

        // both DbSingletonLazy objects will be stored at the same address:
        DbSingletonLazy lazyInstance = DbSingletonLazy.getInstance();
        System.out.println(lazyInstance);

        DbSingletonLazy anotherLazyInstance = DbSingletonLazy.getInstance();
        System.out.println(anotherLazyInstance);

        // both DbSingletonLazyThreadSafe objects will be stored at the same address:
        DbSingletonLazyThreadSafe lazyThreadSafeInstance = DbSingletonLazyThreadSafe.getInstance();
        System.out.println(lazyThreadSafeInstance);

        DbSingletonLazyThreadSafe anotherLazyThreadSafeInstance = DbSingletonLazyThreadSafe.getInstance();
        System.out.println(anotherLazyThreadSafeInstance);
    }
}
