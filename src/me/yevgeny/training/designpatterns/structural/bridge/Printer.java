package me.yevgeny.training.designpatterns.structural.bridge;

import java.util.List;

/**
 * This represents the first half of the bridge. The client can use this abstracted "Printer" to print different things.
 * <p>
 * The printer only needs a formatter (of any kind, that implements the "Formatter" interface).
 *
 * @author Yevgeny Kuznetsov
 * @see Formatter
 * @see MoviePrinter
 */
public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();

    abstract protected String getHeader();
}
