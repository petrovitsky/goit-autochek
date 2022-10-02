package main.module9.test;

import java.util.*;

public class DequeTest {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Eugene");
        deque.add("Vika");
        deque.add("Sacha");
        deque.add("Larysa");

        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque);
    }
}
