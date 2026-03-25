package org.example;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack<T> {
    private T[] elements;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.elements = (T[]) new Object[capacity]; //không thể khởi tạo với kiểu tổng quát. Do đó, chúng ta khởi tạo một mảng Object và ép kiểu về kiểu tổng quát T

    }

    public void push(T item) {
        if (!isFull()) {
            elements[top] = item;
            top++;
        }else {
            System.out.println("Pushing failed. Stack is full.");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            int tmp = top;
            top--;
            return elements[tmp];
        }else {
            System.out.println("Popping failed. Stack is empty.");
            return null;
        }
    }


    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }
}