package main.module9.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyArrayList<>(1);

        arrayList.add(14);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        for (Integer i : arrayList) {
            System.out.println("i = " + i);
        }
        System.out.println("arrayList.size() = " + arrayList.size());
        System.out.println("after removing");
        arrayList.remove(0);
        for (Integer i : arrayList) {
            System.out.println("i = " + i);
        }
        System.out.println("arrayList.size() = " + arrayList.size());
        arrayList.clear();
        System.out.println("After clear");
        for (Integer i : arrayList) {
            System.out.println("i = " + i);
        }

        arrayList.add(777);

        System.out.println(arrayList);

        arrayList.add(888);
        System.out.println(arrayList);
    }
}
