package main.module9.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        testInharitance( new A(){
            @Override
            public void printer() {
                System.out.println("Printer from the anonimmus class");
            }
                        }
        );

        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Bill");

        Object[] array = names.toArray();
        System.out.println(array);

        int hashCode = names.hashCode();



    }

    public static void testInharitance(A element){

    }
}

interface A {
    void printer();
}

class AImpl implements A {

    @Override
    public void printer() {
        System.out.println("Printer from the interface");
    }

    public void foo (){
        throw new UnsupportedOperationException();
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

