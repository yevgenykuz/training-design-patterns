package me.yevgeny.training.designpatterns.structural.bridge;

/**
 * @author Yevgeny Kuznetsov
 */
public class Detail {
    private String label;
    private String value;

    public Detail(String label, String value) {
        this.label = label;
        this.value = value;
    }

    /**
     * Gets the label
     *
     * @return value of label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Gets the value
     *
     * @return value of value
     */
    public String getValue() {
        return value;
    }
}
