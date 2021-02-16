package implementation;

import myinterface.StackADT;

public class MyStack implements StackADT {
    //head
    private Node top;
    //to keep count of number of node in list
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(int element) {
        Node node = new Node(element);
        node.setNext(top);
        top = node;
        size ++;
    }

    @Override
    public int pop() {
        int response = 0;//invalid data
        if(!isEmpty()){
            response = top.getData();
            top = top.getNext();
            size --;
        }
        else{
            System.out.println("Stack UnderFlow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response = 0;
        if(!isEmpty()){
            response = top.getData();
        }
        else{
            System.out.println("Stack is empty");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }
    //no of nodes in stack without using size field
    public int sizeByTraversing(){
        int count = 0;
        Node temp = top;
        while(temp != null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }
    public void traverse(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.getData() + ", ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
