package main.module9.homework;

import jdk.internal.util.ArraysSupport;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 1;
    private int size;
    private Object[] data;
    public MyArrayList (){
        data = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList (int capacity){
        data = (E[]) new Object[capacity];
    }


    private Object[] grow(int minCapacity) {
        int oldCapacity = data.length;
        if (oldCapacity > 0) {
            return data = Arrays.copyOf(data, (int) (oldCapacity * 1.2));
        } else {
            return data = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
    }
    private void add (E element, Object [] data, int s){
           if ( s == data.length ) {
               data = grow(s + 1);
           }
           data[s] = element;
           size = s + 1;

    }
    @Override
    public boolean add(E value) {
      add( value , data , size);
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

    public boolean isEmpty() {
        return size == 0;
    }
}
