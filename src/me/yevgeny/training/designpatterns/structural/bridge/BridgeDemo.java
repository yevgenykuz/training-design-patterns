package me.yevgeny.training.designpatterns.structural.bridge;

/**
 * @author Yevgeny Kuznetsov
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("The Equalizer");
        movie.setYear("2014");
        movie.setRuntime("2:12");

        // We create a new printer with a specific implementation we need, and pass it the data we want to print:
        Printer moviePrinter = new MoviePrinter(movie);

        // We create a new formatter of a specific type we need to be used with the moviePrinter:
        Formatter printFormatter = new PrintFormatter();

        /**
         * The bridge:
         * printFormatter and moviePrinter now nothing about each other. Each one can be changed independently.
         */

        // We use our specific formatter with our specific printer to print:
        String printerMaterial = moviePrinter.print(printFormatter);
        System.out.println(printerMaterial);


        // We create another formatter of a different specific type we need to be used with the moviePrinter:
        Formatter htmlFormatter = new HtmlFormatter();

        /**
         * The bridge:
         * We can create as many "Formatter" types as we want without creating more "Printer" types, and vice versa.
         */

        // We use our specific formatter with our specific printer to print:
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);
    }
}
