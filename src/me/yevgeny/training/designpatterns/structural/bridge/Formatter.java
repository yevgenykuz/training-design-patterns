package me.yevgeny.training.designpatterns.structural.bridge;

import java.util.List;

/**
 * This is the second half of the bridge. This formatter contract is used by the abstracted "Printer" when printing. Any
 * printer type that extends "Printer" must use a formatter that implements this interface.
 *
 * @author Yevgeny Kuznetsov
 * @see Printer
 * @see PrintFormatter
 */
public interface Formatter {
    String format(String header, List<Detail> details);
}
