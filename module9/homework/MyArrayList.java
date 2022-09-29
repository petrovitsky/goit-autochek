package main.module9.homework;

import jdk.internal.util.ArraysSupport;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 16;
    private int size;
    private Object[] data;

    private Object[] grow(int minCapacity) {
        int oldCapacity = data.length;
        if (oldCapacity > 0) {
            int newCapacity = ArraysSupport.newLength(oldCapacity,
                    minCapacity - oldCapacity, /* minimum growth */
                    oldCapacity >> 1           /* preferred growth */);
            return data = Arrays.copyOf(data, oldCapacity * );
        } else {
            return data = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
    }

    @Override
    public boolean add(E value) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }
}
