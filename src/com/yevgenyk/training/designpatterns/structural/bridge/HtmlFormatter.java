package com.yevgenyk.training.designpatterns.structural.bridge;

import java.util.List;

/**
 * Just like "PrintFormatter" ,this completes the second half of the bridge, with a different implementation. It
 * implements the "Formatter" interface to and provides specific format of a "Printer".
 * <p>
 * The bridge allows us to add more formatter classes like this without adding more "Printers".
 *
 * @author Yevgeny Kuznetsov
 * @see Formatter
 * @see PrintFormatter
 */
public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<table>");
        stringBuilder.append("<th>");
        stringBuilder.append("Classification");
        stringBuilder.append("</th>");
        stringBuilder.append("<th>");
        stringBuilder.append(header);
        stringBuilder.append("</th>");

        for (Detail detail : details) {
            stringBuilder.append("<tr><td>");
            stringBuilder.append(detail.getLabel());
            stringBuilder.append("</tr><td>");
            stringBuilder.append(detail.getValue());
            stringBuilder.append("</td></tr>");
        }

        stringBuilder.append("</table>");
        return stringBuilder.toString();
    }
}
