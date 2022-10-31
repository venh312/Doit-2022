package chapter_04;

public class ArrayQueue<E> {
    private E[] que;
    private int capacity;
    private int num;

    public ArrayQueue(int maxlen) {
        capacity = maxlen;
        num = 0;
        try {
            que = (E[]) new Object[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E enQueue(E x) {
        if (num >= capacity) {
            throw new RuntimeException("OverflowException");
        }
        return que[num++] = x;
    }

    public E deQueue() {
        if (num <= 0) {
            throw new RuntimeException("EmptyException");
        }

        E x = que[0];

        for (int i=0; i<num-1; i++) {
            que[i] = que[i+1];
        }
        num--;

        return x;
    }

    public E peek() {
        if (num <= 0) {
            throw new RuntimeException("EmptyException");
        }
        return que[num-1];
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue<Integer>(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
