package _02_queue;

import java.util.Arrays;

// 🎯Note: Queue Interface In Java
public class MyQueue {
    private int arr[]; // array → queue elements store करने के लिए
    private int front = 0; // front pointer → remove operation यहीं से होगा
    private int size = 0; // current size of queue

    public MyQueue() {
        this.arr = new int[5]; // default capacity = 5
    }

    public MyQueue(int capacity) {
        this.arr = new int[capacity]; // custom capacity queue
    }

    public void add(int val) throws Exception {
        if (isFull()) { // अगर queue full है → Exception throw करो
            throw new Exception("Queue is FULL!");
        }

        // arr[size] = val; ❌ (गलत क्योंकि circular queue में index बदलता है)
        int nxtIidx = (front + size) % arr.length; // next insertion index (circular logic)
        arr[nxtIidx] = val; // नया element डालना

        size++; // size बढ़ाना
    }

    public int remove() throws Exception {
        if (isEmpty()) { // अगर queue empty है → Exception throw करो
            System.out.println("Array is EMPTY!");
            throw new Exception("Queue is EMPTY!");
        }
        int temp = arr[front]; // front element निकालना
        arr[front] = 0; // optional: clear कर दिया

        // this.front++; ❌ (गलत क्योंकि circular queue में wrap करना पड़ता है)
        this.front = (this.front + 1) % arr.length; // circular increment
        this.size--; // size घटाना

        return temp; // removed element return करना
    }

    // helper methods
    public boolean isEmpty() {
        return (this.size == 0); // अगर size 0 है → queue empty
    }

    public boolean isFull() {
        return (this.size == arr.length); // अगर size == capacity → queue full
    }

    public void display() {
        System.out.print("front <- ");
        System.out.println(Arrays.toString(arr)); // पूरा array print करना
    }
}