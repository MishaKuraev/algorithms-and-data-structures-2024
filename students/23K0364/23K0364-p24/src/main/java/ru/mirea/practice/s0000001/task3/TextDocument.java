package ru.mirea.practice.s0000001.task3;

public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("TextDocument opened.");
    }

    @Override
    public void save() {
        System.out.println("TextDocument saved.");
    }

    @Override
    public void close() {
        System.out.println("TextDocument closed.");
    }
}
