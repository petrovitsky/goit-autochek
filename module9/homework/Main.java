package main.module9.homework;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>(12);
        System.out.println("list.size() = " + list.size());
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("list.get(3) = " + list.get(3));
        System.out.println(list);

        List<String> sList = new ArrayList<>();
        sList.add("sws");
        System.out.println("sList.get(2) = " + sList.get(2));
    }
}


