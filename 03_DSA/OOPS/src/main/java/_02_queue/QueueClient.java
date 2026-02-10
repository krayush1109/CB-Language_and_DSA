package _02_queue;

public class QueueClient {
    public static void main(String[] args) throws Exception {
        MyQueue q = new MyQueue(5); // capacity = 5 वाली queue बनाना

        // enqueue (add) operations
        q.add(15);
        q.add(30);
        q.add(35);
        q.add(40);
        q.add(50);
        q.display(); // queue state print करना

        // dequeue (remove) operations → FIFO principle
        System.out.println(q.remove()); // 15 निकलेगा (front element)
        System.out.println(q.remove()); // 30 निकलेगा
        System.out.println(q.remove()); // 35 निकलेगा
        System.out.println(q.remove()); // 40 निकलेगा
        System.out.println(q.remove()); // 50 निकलेगा → अब queue empty

        // दोबारा enqueue करना (circular queue logic काम करेगा)
        q.add(60);
        q.add(65);

        q.display(); // queue state फिर से print करना
    }
}