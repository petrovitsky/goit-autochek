package main.module9.homework;

import java.util.Iterator;

public interface MyList <E> extends Iterable <E> {
    boolean add(E value);
    boolean remove(int index);
    void clear();
    int size();
    E get(int index);
}
