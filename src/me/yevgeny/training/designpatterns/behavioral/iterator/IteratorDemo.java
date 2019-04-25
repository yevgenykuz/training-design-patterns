package me.yevgeny.training.designpatterns.behavioral.iterator;

import java.util.Iterator;

/**
 * @author Yevgeny Kuznetsov
 */
public class IteratorDemo {
    public static void main(String[] args) {
        BikeRepository bikeRepository = new BikeRepository();

        bikeRepository.addBike("BMW");
        bikeRepository.addBike("Ducati");
        bikeRepository.addBike("Yamaha");

        // BikeRepository implements Iterable, so we can use its iterator:
        Iterator<String> bikeIterator = bikeRepository.iterator();
        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        // Or, we can use foreach (that uses its iterator):
        for (String bike : bikeRepository) {
            System.out.println(bike);
        }
    }
}
