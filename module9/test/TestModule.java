package main.module9.test;

import java.util.ArrayList;
import java.util.List;

public class TestModule {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] data = {"dedw", "wdwdcrv>", "fweferf"};
        new TypeArrayPrinter().printer(data);
    }
}


class TypeArrayPrinter {
    public <E> void printer(E[] data) {
        int counter = 1;
        for (E element : data) {
            System.out.println("element " + counter++ + " = " + element);
        }
    }
}