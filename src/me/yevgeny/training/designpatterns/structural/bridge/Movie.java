package me.yevgeny.training.designpatterns.structural.bridge;

/**
 * @author Yevgeny Kuznetsov
 */
public class Movie {

    private String classification;
    private String runtime;
    private String title;
    private String year;

    /**
     * Gets the classification
     *
     * @return value of classification
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the classification
     *
     * @param classification
     *         the classification
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

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

    /**
     * Gets the title
     *
     * @return value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title
     *
     * @param title
     *         the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the year
     *
     * @return value of year
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the year
     *
     * @param year
     *         the year
     */
    public void setYear(String year) {
        this.year = year;
    }
}
