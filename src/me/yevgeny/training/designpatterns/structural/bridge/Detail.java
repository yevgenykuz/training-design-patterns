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

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
