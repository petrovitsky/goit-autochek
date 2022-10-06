package main.module9.test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

    }

    public static <T extends A> T summ(T a, T b) {
        return a;
    }
}

class A<T> extends Number {
    private T value;

    public A(T value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int) value;
    }

    @Override
    public long longValue() {
        return (long) value;
    }

    @Override
    public float floatValue() {
        return (float) value;
    }

    @Override
    public double doubleValue() {
        return (double) value;
    }

    public void foo() {
        System.out.println("Foo method");
    }
}