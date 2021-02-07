package com.yevgenyk.training.designpatterns.behavioral.iterator;

import java.util.Iterator;

/**
 * This object implements the Iterable interface, and therefore is required to implement an iterator for its data.
 *
 * @author Yevgeny Kuznetsov
 */
public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    public void addBike(String bike) {
        // Increase the bikes array if needed:
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
        }

        bikes[index] = bike;
        index++;
    }


    /** Actual iterator implementation */
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int currentIndex = 0;

            /** Check if there is a bike in the currentIndex and that the currentIndex is less than the end of the
             * array */
            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            /** Returns the current bike, and <b>then</b> increment currentIndex (for the next call). */
            @Override
            public String next() {
                return bikes[currentIndex++];
            }
        };
    }
}
