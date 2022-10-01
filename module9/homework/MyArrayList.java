package main.module9.homework;

import jdk.internal.util.ArraysSupport;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private Object[] data;

    public MyArrayList (){
        data = (E[]) new Object[DEFAULT_CAPACITY];
    }


    private Object[] grow(int minCapacity) {
        int oldCapacity = data.length;
        if (oldCapacity > 0) {
            int newCapacity = ArraysSupport.newLength(oldCapacity,
                    minCapacity - oldCapacity, /* minimum growth */
                    oldCapacity >> 1           /* preferred growth */);
            return data = Arrays.copyOf(data, oldCapacity *  2);
        } else {
            return data = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
    }

    @Override
    public boolean add(E value) {
      data[size++] = value;
      return true;
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
        return size;
    }

    @Override
    public E get(int index) {
        return (E) data[index];
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
