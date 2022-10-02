package main.module9.homework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyArrayList<E> implements MyList<E> {
    private static final Logger logger = Logger.getAnonymousLogger();
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private E[] data = (E[]) new Object[DEFAULT_CAPACITY];

    public MyArrayList() {


    }

    public MyArrayList(int capacity) {
        try {
            data = (E[]) new Object[capacity];
        } catch (ClassCastException e) {
            logger.log(Level.INFO, "Constructor exception" );
        }

    }


    private Object[] grow(int minCapacity) {
        int oldCapacity = data.length;
        if (oldCapacity > 0) {
            data = Arrays.copyOf(data, oldCapacity * 2);
            return data;
        } else {
            data = (E[]) new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
            return data;
        }
    }

    private void add(E element, Object[] data, int s) {
        if (s == data.length) {
            data = grow(s + 1);
        }
        data[s] = element;
        size = s + 1;

    }

    @Override
    public boolean add(E value) {
        add(value, data, size);
        return true;
    }

    @Override
    public boolean remove(int index) {
        remove(data, index);
        return true;
    }

    private void remove(Object[] data, int i) {
        final int newSize;
        if ((newSize = size - 1) > i) {
            System.arraycopy(data, i + 1, data, i, newSize - i);
        }
        size = newSize;
        data[size] = null;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return data[index];
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {

            private int index;

            @Override
            public boolean hasNext() {
                return index < data.length /*&& data[index] != null*/
                        ;
            }

            @Override
            public E next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                } else{
                return data[index++];}
            }
        };
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
