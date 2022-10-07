package main.module9.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <MyUser> list = new ArrayList<>();
        list.add(new MyUser("Yeugen", 34));
        list.add(new MyUser("Sergiy", 23));
        System.out.println("list = " + list);


    }
}

class MyUser {
    private  String name;
    private int age;
    MyUser(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

