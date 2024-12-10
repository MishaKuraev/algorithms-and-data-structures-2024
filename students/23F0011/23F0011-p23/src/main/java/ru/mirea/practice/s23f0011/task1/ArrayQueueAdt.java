package ru.mirea.practice.s23f0011.task1;

public class ArrayQueueAdt {
    private Object[] elements;
    private int size;
    private int head;
    private int tail;

    public ArrayQueueAdt() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    public static void enqueue(ArrayQueueAdt queue, Object element) {
        assert queue != null && element != null : "Queue or element is null";
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public static Object element(ArrayQueueAdt queue) {
        assert queue != null && queue.size > 0 : "Queue is empty";
        return queue.elements[queue.head];
    }

    public static Object dequeue(ArrayQueueAdt queue) {
        assert queue != null && queue.size > 0 : "Queue is empty";
        Object result = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        Object ans = result;
        queue.size--;
        return ans;
    }

    public static int size(ArrayQueueAdt queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueAdt queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueAdt queue) {
        queue.elements = new Object[10];
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }

    private static void ensureCapacity(ArrayQueueAdt queue, int capacity) {
        if (capacity > queue.elements.length) {
            Object[] newElements = new Object[2 * queue.elements.length];
            for (int i = 0; i < queue.size; i++) {
                newElements[i] = queue.elements[(queue.head + i) % queue.elements.length];
            }
            queue.elements = newElements;
            queue.head = 0;
            queue.tail = queue.size;
        }
    }
}
