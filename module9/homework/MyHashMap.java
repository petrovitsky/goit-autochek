package main.module9.homework;

import java.util.Objects;

public class MyHashMap<K, V> implements MyMap<K, V> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    static final int MAXIMUM_CAPACITY = Integer.MAX_VALUE / 2;

    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private MyHashMap.Node<K, V>[] table = new Node[DEFAULT_INITIAL_CAPACITY];

    int threshold;
    int size;

    @Override
    public V put(K key, V value) {

        int index = hash(key);
        Node<K, V> newNode = new Node<>(hash(key), key, value, null);

        // Adding without collision
        if (table[index] == null) {
            return putFirst(newNode, index);
        }

        // Adding with collision or update
        Node<K, V> current = table[index];
        //When the Node is not one
        while (current.next != null) {
            if (comparing(newNode, current)) {
                return value;
            }
            current = current.next;
        }
        //When the Node is one
        if (comparing(newNode, current)) {
            return value;
        } else {
            current.next = newNode;
            size++;
        }
        return value;
    }

    private boolean comparing(Node<K, V> newNode, Node<K, V> current) {
        if (current.key.equals(newNode.key)) {
            current.value = newNode.value;
            return true;
        }
        return false;
    }

    private V putFirst(Node<K, V> newNode, int hash) {
        table[hash] = newNode;
        size++;
        return newNode.value;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void clear() {
    //TOdo
    }

    @Override
    public int size() {
        return size;
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
        return (key == null) ? 0 : Math.abs(key.hashCode() % table.length);
    }
}
