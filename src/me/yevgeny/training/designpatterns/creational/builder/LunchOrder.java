package me.yevgeny.training.designpatterns.creational.builder;

/**
 * @author Yevgeny Kuznetsov
 */
public class LunchOrder {

    /**
     * This is the builder that will be used to create LunchOrder objects. It can be in a separate class.
     * <p>
     * It has inner parameters to hold (-contain) data up to the moment the actual LunchOrder object is created.
     */
    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        /**
         * An empty public constructor without parameters.
         * <p>
         * We can add parameters to force values on creation - all must have bread, for example.
         */
        public Builder() {

        }

        /**
         * The actual creation of LunchOrder.
         * <p>
         * This builder is passed as a parameter. All local variables will be used to create the LunchOrder object.
         *
         * @return
         */
        public LunchOrder build() {
            return new LunchOrder(this);
        }

        /**
         * Returns this builder with the bread variable updated, allowing further manipulation before actual LunchOrder
         * object creation.
         *
         * @param bread
         *
         * @return
         */
        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        /**
         * Returns this builder with the condiments variable updated, allowing further manipulation before actual
         * LunchOrder object creation.
         *
         * @param condiments
         *
         * @return
         */
        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        /**
         * Returns this builder with the dressing variable updated, allowing further manipulation before actual
         * LunchOrder object creation.
         *
         * @param dressing
         *
         * @return
         */
        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        /**
         * Returns this builder with the meat variable updated, allowing further manipulation before actual LunchOrder
         * object creation.
         *
         * @param meat
         *
         * @return
         */
        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    /**
     * Gets the bread
     *
     * @return value of bread
     */
    public String getBread() {
        return bread;
    }

    /**
     * Gets the condiments
     *
     * @return value of condiments
     */
    public String getCondiments() {
        return condiments;
    }

    /**
     * Gets the dressing
     *
     * @return value of dressing
     */
    public String getDressing() {
        return dressing;
    }

    /**
     * Gets the meat
     *
     * @return value of meat
     */
    public String getMeat() {
        return meat;
    }
}
