package main.module9.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       list.add("Eugene");
       list.add("Viktoriia");
        System.out.println("list = " + list);
        System.out.println("list.get(5) = " + list.get(5));
    }
}

interface  A {
    void Foo ();
}
abstract class B implements A{

}
class C extends B {
    @Override
    public void Foo() {

    }
}
