package com.yevgenyk.training.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the abstraction for all components, including both simple "leaf" components or composite components (like
 * "Menu").
 * <p>
 * It declares the interface for objects in the composition (in this case its an abstract class, but can be an interface
 * as well).
 *
 * @author Yevgeny Kuznetsov
 * @see Menu
 * @see MenuItem
 */
public abstract class MenuComponent {

    String name;
    String url;
    // this holds the children list for composite components only:
    List<MenuComponent> menuComponents = new ArrayList<>();

    /**
     * These can be used as a contract for other composite components ("ComplexMenu", for example).
     * <p>
     * These are not abstract because "leaf" components can not implement these. Only composite components will override
     * these.
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented for this type");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented for this type");
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public abstract String toString();

    /**
     * Prints the name and url of a method component (can be a Menu or a MenuItem)
     *
     * @param menuComponent
     *         the component that's going to be printed
     *
     * @return value of name
     */
    String print(MenuComponent menuComponent) {
        return menuComponent.getName() + ": " + menuComponent.getUrl() + System.lineSeparator();
    }
}
