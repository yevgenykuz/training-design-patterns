package me.yevgeny.training.designpatterns.behavioral.visitor;

/**
 * This is the element interface. All elements accept visitors.
 *
 * @author Yevgeny Kuznetsov
 */
public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
