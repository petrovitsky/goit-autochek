package main.module9.homework;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<E> implements MyList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

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

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }


}
