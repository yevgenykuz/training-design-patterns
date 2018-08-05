package me.yevgeny.training.designpatterns.structural.composite;

/**
 * This represents a leaf. It implements the methods of the component.
 *
 * @author Yevgeny Kuznetsov
 * @see MenuComponent
 * @see Menu (Parent)
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
