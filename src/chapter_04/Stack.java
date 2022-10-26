package chapter_04;

import java.util.EmptyStackException;

public class Stack<E> {
    private E[] stk;
    private int capacity;
    private int ptr;

    public Stack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = (E[]) new Object[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E push(E x) {
        if (ptr >= capacity) {
            throw new StackOverflowError();
        }
        return stk[ptr++] = x;
    }

    public E pop() {
        if (ptr <= 0) {
            throw new EmptyStackException();
        }
        return stk[--ptr];
    }

    public E peek() {
        if (ptr <= 0) {
            throw new EmptyStackException();
        }
        return stk[ptr - 1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf (E x) {
        for (int i=ptr-1; i>=0; i--) {
            if (stk[i] == x){
                return i;
            }
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    public void dump() {
        if (ptr <= 0) {
            System.out.println("Empty stack");
        } else {
            for (int i=0; i<ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack intStack = new Stack<Integer>(4);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(1);

        System.out.println(intStack.size());
        intStack.dump();
        intStack.pop();
        intStack.dump();

        System.out.println("================================");

        Stack strStack = new Stack<String>(5);
        strStack.push("A");
        strStack.push("B");
        strStack.push("A");
        strStack.push("C");
        strStack.push("D");
        strStack.push("D");

        System.out.println(strStack.size());
        strStack.dump();
        strStack.pop();
        strStack.dump();
    }

}
