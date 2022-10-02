package main.module9.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("list.size() = " + list.size());
        list.remove(4);
        System.out.println("list.size() = " + list.size());
    }
}
