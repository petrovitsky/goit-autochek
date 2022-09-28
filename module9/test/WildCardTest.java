package main.module9.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {
    public static void driveAllTransport(List<? extends Transport> t) {
        for (Transport transport : t) {
            transport.drive();
        }
    }

    public <T,S,V> void fillListOfEntyties(S data) {

    }


    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            transports.add(new Transport());
        }

        for (Transport t : transports) {
            System.out.println(t);
        }

    }
}

class FirstCar {

}

class Transport extends FirstCar {
    protected static int entityCounter;
    private int index;

    public int getIndex() {
        return index;
    }


    public Transport() {
        this.index = entityCounter;
        entityCounter++;
    }

    public void drive() {
        System.out.println("Transport is going");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "index=" + index +
                '}';
    }
}

class Car extends Transport {
    @Override
    public void drive() {
        System.out.println("Car is deiving");
    }
}