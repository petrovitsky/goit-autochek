package main.module9.homework;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;


public class MyLinkedList<E> implements MyList {
    private int size;
    private Node<E> first;
    private Node<E> last;

   public MyLinkedList(){
       last = new Node<>(first , null, null);
       first = new Node<>(null, null, last);
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

        public E getItem() {
            return item;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
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


     void addFirst(E element){
       Node<E> current = first;
       current.item = element;
       first = new Node<>(null,null,current);
       current.prev = first;
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
        if (index < 0 && index < size) {
            throw new IllegalArgumentException("Incorrect index!!!");
        } else {
            return  nodeOf(index).item;
        }
    }

    private Node<E> nodeOf(int index){
        Node<E> res = first;
        for (int i = 0; i <= index; i++) {
            res = res.next;
        }
        return res;

//        if (index < (size >> 1)){
//            Node<E> res = first;
//            for (int i = 0 ; i < index; i ++){
//                res = res.next;
//            }
//            return res;
//        } else {
//            Node<E> res = last;
//            for (int i = 0; i > index ; i--) {
//                res = res.prev;
//            }
//            return res;
//        }
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }


}
