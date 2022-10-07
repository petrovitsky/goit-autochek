package main.module9.homework;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;


public class MyLinkedList<E> implements MyList {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public MyLinkedList() {
        this.first = new Node<>(null, null, last);
        this.last = new Node<>(first, null, null);
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

    }

    @Override
    public boolean add(Object value) {
        addLast((E) value);
        return true;
    }

    private void addLast(E value) {
        Node<E> current = last;
        current.item = value;
        last = new Node<>(current, null, null);
        current.next = last;
        size++;
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
        if (index >= 0 && index < size) {
            throw new IllegalArgumentException("Incorrect index!!!");
        } else {
            return  first.item;
        }
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }


}
