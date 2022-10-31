package chapter_04;

public class Queue<E> {
    private E[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    public Queue(int maxlen) {
        capacity = maxlen;
        front = rear = num = 0;
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
        num++;
        return que[rear++ % capacity] = x;
    }

    public E deQueue() {
        if (num <= 0) {
            throw new RuntimeException("EmptyException");
        }

        E x = que[front++ % capacity];
        num--;
        return x;
    }

    public void dump() {
        for (int i=0; i<num; i++) {
            System.out.print(que[(i + front) % capacity]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Queue queue = new Queue<Integer>(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.dump();
        queue.deQueue();
        queue.deQueue();
        queue.dump();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.dump();
    }
}
