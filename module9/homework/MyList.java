package main.module9.homework;

public interface MyList <E> {
    boolean add(E value);
    boolean remove(int index);
    void clear();
    int size();
    E get(int index);
}
