package me.yevgeny.training.designpatterns.creational.builder;

/**
 * @author Yevgeny Kuznetsov
 */
public class BuilderDemo {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        // lunchOrder is immutable after creation:
        LunchOrder lunchOrder = builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey").build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
