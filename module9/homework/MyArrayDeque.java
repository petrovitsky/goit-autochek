package main.module9.homework;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class MyArrayDeque<E> implements MyDeque<E> {
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
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }
}
