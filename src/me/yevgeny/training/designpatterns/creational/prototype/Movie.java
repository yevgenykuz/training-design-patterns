package me.yevgeny.training.designpatterns.creational.prototype;

/**
 * @author Yevgeny Kuznetsov
 */
public class Movie extends Item {

    private String runtime;

    /**
     * Gets the runtime
     *
     * @return value of runtime
     */
    public String getRuntime() {
        return runtime;
    }

    /**
     * Sets the runtime
     *
     * @param runtime
     *         the runtime
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
