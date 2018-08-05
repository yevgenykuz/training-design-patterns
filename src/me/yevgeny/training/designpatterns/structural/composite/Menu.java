package me.yevgeny.training.designpatterns.structural.composite;

import java.util.Iterator;

/**
 * This is a composite component. It has children ("leafs" - which can be other "Menu"s or simple "MenuItems"s).
 * <p>
 * It implements methods to manipulate its children (these are not specified in the MenuComponent abstract).
 * <p>
 * It also implements the methods of the component, but typically delegates this functionality to its children.
 * <p>
 * Both leaf and composite have same functionality, but a composite has the knowledge about the children it has and the
 * actions it can do with its children.
 *
 * @author Yevgeny Kuznetsov
 * @see MenuComponent
 * @see MenuItem (child)
 */
public class Menu extends MenuComponent {
    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(); // builder design pattern

        stringBuilder.append(print(this));

        // The composite design pattern allows us to iterate over all children:
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            // Here, both children (MenuItem) and parent (Menu) implement the MenuComponent toString() method:
            stringBuilder.append(menuComponent.toString());
        }
        return stringBuilder.toString();
    }
}
