package ru.mirea.practice.s23k0114.lab1;

public interface Queue<T> {
    void enqueue(T element);

    T dequeue();

    T element();

    int size();

    boolean isEmpty();

    void clear();
}
