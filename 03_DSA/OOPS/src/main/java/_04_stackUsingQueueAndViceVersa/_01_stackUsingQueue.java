package _04_stackUsingQueueAndViceVersa;

import java.util.Queue;

public class _01_stackUsingQueue {

    Queue q1 = new Queue(); // main queue
    Queue q2 = new Queue(); // helper queue

    public static void push(int x) {
        q1.enquue(x);
    }

    public static int pop() {
        while (q1.size() > 1) {
            q2.enquue(q1.deq)
        }

    }

}
