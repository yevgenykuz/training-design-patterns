package me.yevgeny.training.designpatterns.creational.singelton;

/**
 * @author Yevgeny Kuznetsov
 */
public class SingeltonDemo {
    public static void main(String[] args) {
        // both DbSingeltonEager objects will be stored at the same address:
        DbSingeltonEager eagerInstance = DbSingeltonEager.getInstance();
        System.out.println(eagerInstance);

        DbSingeltonEager anotherEagerInstance = DbSingeltonEager.getInstance();
        System.out.println(anotherEagerInstance);

        // both DbSingeltonLazy objects will be stored at the same address:
        DbSingeltonLazy lazyInstance = DbSingeltonLazy.getInstance();
        System.out.println(lazyInstance);

        DbSingeltonLazy anotherLazyInstance = DbSingeltonLazy.getInstance();
        System.out.println(anotherLazyInstance);

        // both DbSingeltonLazyThreadSafe objects will be stored at the same address:
        DbSingeltonLazyThreadSafe lazyThreadSafeInstance = DbSingeltonLazyThreadSafe.getInstance();
        System.out.println(lazyThreadSafeInstance);

        DbSingeltonLazyThreadSafe anotherLazyThreadSafeInstance = DbSingeltonLazyThreadSafe.getInstance();
        System.out.println(anotherLazyThreadSafeInstance);
    }
}
