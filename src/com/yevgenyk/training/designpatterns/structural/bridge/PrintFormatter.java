package com.yevgenyk.training.designpatterns.structural.bridge;

import java.util.List;

/**
 * This completes the second half of the bridge. It implements the "Formatter" interface to and provides specific format
 * of a "Printer".
 *
 * @author Yevgeny Kuznetsov
 * @see Formatter
 */

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(header);
        stringBuilder.append(System.lineSeparator());
        for (Detail detail : details) {
            stringBuilder.append(detail.getLabel());
            stringBuilder.append(":");
            stringBuilder.append(detail.getValue());
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
