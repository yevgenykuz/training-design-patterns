package me.yevgeny.training.designpatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * This is the proxy that secures TwitterService usage.
 *
 * @author Yevgeny Kuznetsov
 * @see TwitterService
 */
public class SecurityProxy implements InvocationHandler {

    private Object obj;

    /**
     * We store the wrapped object locally in this proxy
     *
     * @param obj
     *         the object we wrap
     */
    private SecurityProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * Here we build a wrapping SecurityProxy around the input object (TwitterServceStub, for example) and the
     * interfaces that object implements.
     * <p>
     * This is done to wrap (-secure) the objects (TwitterServceStub for example) implementation.
     */
    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
                new SecurityProxy(obj));
    }

    /**
     * Here we can implement security measures when invoking methods from the wrapped object.
     * <p>
     * We will prevent postToTimeline method invocation as an example.
     * <p>
     * We are not using the proxy input parameter. We use the local obj instantiated beforehand.
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        try {
            if (method.getName().contains("post")) {
                throw new IllegalAccessException("postToTimeline is not allowed");
            }

            result = method.invoke(obj, args);
        } catch (InvocationTargetException ie) {
            throw ie.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        }

        return result;
    }
}
