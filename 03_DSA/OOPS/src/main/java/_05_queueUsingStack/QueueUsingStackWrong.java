package _05_queueUsingStack;

import java.util.Stack;

public class QueueUsingStackWrong {
    Stack<Integer> stack1 = new Stack<>(); // main stack
    Stack<Integer> stack2 = new Stack<>(); // helper stack

    // Enqueue → बस stack1 में डाल दो (O(1))
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue → सबसे पुराना element निकालना है (O(n) worst case)
    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        // अगर stack2 खाली है → stack1 से सब निकालकर stack2 में डालो
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // अब stack2 का top ही front है
        return stack2.pop();
    }

    // Peek front element
    public int front() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
