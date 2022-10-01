package main.module9.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> arr = new MyArrayList<>();
        arr.add(10);
        arr.add(20);
        try {
            System.out.println(arr.get(1));
        } catch (IndexOutOfBoundsException e){
            System.err.println(e.getStackTrace());
        }

        System.out.println("arr.size() = " + arr.size());


        List<Integer> test = new ArrayList<>();
        test.add(11);
        test.add(21);

        System.out.println("test.get() = " + test.get(1));
        System.out.println("test.size() = " + test.size());
    }
}
