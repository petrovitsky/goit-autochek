package main.module6;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        new A().new B();

    }
}

class A {
    private String name;
    private String surName;
    public A(){
            System.out.println("A constructor");

    }
    class B{
        public B(){
            System.out.println("B constructor");
        }
    }

}
