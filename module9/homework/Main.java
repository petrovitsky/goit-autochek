package main.module9.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int size = 5;
        int index = 2;
        System.out.println("size = " + size + " index = " + index + " result  of (size >> 1) =  " + size);

    }

}


class MyUser {
    private String name;
    private int age;

    MyUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name = '" + name + '\'' +
                        ", age = " + age;
    }
}

