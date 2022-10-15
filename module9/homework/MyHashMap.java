package main.module9.homework;

import java.util.HashMap;
import java.util.Objects;

public class MyHashMap<K, V> implements MyMap<K, V> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    static final int MAXIMUM_CAPACITY = Integer.MAX_VALUE / 2;

    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private MyHashMap.Node<K, V>[] table = new Node<>[DEFAULT_INITIAL_CAPACITY];


    int threshold;
    int size;

    @Override
    public V put(K key, V value) {
        Node<K, V> newNode = new Node<>(hash(key), key, value, null);

        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    static class Node<K, V> implements MyMap.Entry<K, V> {
        final int hash;
        final K key;
        V value;
        MyHashMap.Node<K, V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return key.equals(node.key) && value.equals(node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode() % table.length);
    }
}
