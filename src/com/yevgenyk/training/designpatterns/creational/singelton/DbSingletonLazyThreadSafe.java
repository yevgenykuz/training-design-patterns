package com.yevgenyk.training.designpatterns.creational.singelton;

/**
 * This is the singleton that can be created only once.
 * <p>
 * It is created lazily, only when we use it. It is thread safe
 *
 * @author Yevgeny Kuznetsov
 */
public class DbSingletonLazyThreadSafe {

    /** The instance variable should be volatile */
    private static volatile DbSingletonLazyThreadSafe instance = null;

    private DbSingletonLazyThreadSafe() {
        // Prevent loading this singleton using reflection
        if (null != instance) {
            throw new RuntimeException("Use getInstance() method to create this object");
        }
    }

    /**
     * We will make it thread safe by implementing the double-check locking mechanism.
     * <p>
     * To minimize performance hit, we will not synchronize the whole "getInstance()" method. If we do that, this class
     * will be synchronized every time "getInstance" is called.
     * <p>
     * Instead, we will create an inner synchronized block. This time, the class will be synchronized only when the
     * instance is created for the first time.
     */
    public static DbSingletonLazyThreadSafe getInstance() {
        if (null == instance) {
            synchronized (DbSingletonLazyThreadSafe.class) {
                // We check for null one more time to prevent double instantiation - only one class checks this during
                // a given time period (because its inside a synchronized block).
                if (null == instance) {
                    instance = new DbSingletonLazyThreadSafe();
                }
            }
        }
        return instance;
    }
}
