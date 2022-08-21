package main;

import java.util.Arrays;

public class HarekDataMaker {
    public String aggregateSingle(String name, String age, String planet) {

        return "name - " + name + ", age - " + age + ", planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String[] allData = new String[3];
        for (int i = 0; i < 3; i++) {
            allData[i] = aggregateSingle(names[i], String.valueOf(ages[i]), planets[i]);
        }
        return allData;
    }
}

class Test {
    public static void main(String[] args) {
        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");

        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));
    }
}
