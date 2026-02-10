package _05_queueUsingStack;

public class QueueClient {
    public static void main(String[] args){

        // _01_ImplQueueUsingStack q = new _01_ImplQueueUsingStack();
        QueueUsingStackWrong q = new QueueUsingStackWrong();
        
        System.out.println(q.isEmpty());
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        
        System.out.println(q.isEmpty());
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
        q.enqueue(50);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());        
    }
}
