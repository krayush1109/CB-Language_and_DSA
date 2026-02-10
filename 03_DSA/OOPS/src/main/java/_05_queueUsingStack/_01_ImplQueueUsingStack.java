package _05_queueUsingStack;

import java.util.Stack;

public class _01_ImplQueueUsingStack {
    Stack<Integer> st1 = new Stack<>(); // main stack
    Stack<Integer> st2 = new Stack<>(); // helper stack

    public void enqueue(int x) {

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }

        st1.push(x);
    }

    public int dequeue() {
        if (st1.isEmpty() && st2.isEmpty())
            return -1;

        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        return st2.pop();
    }

    // front value of Queue 
    public int front() {

        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        return st2.peek();
    }
    
    // is Empty ?
    public boolean isEmpty() {
        return st1.isEmpty() && st2.isEmpty();
    }

    public void display() {
        
    }

}
