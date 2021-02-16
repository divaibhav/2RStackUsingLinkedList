package main;

import implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.traverse();
        System.out.println("removed form stack = " + stack.pop());
        stack.traverse();
        System.out.println("element on top of stack = " + stack.peek());
    }
}
