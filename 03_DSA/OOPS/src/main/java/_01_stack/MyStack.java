package _01_stack;

// Stack Class in Java
// - LIFO (Last In First Out) 
// → जो element सबसे आख़िर में डाला गया है वही सबसे पहले निकलेगा
public class MyStack {
    public static int i = 19; // static variable → सभी objects share करेंगे

    private int arr[]; // array → stack elements store करने के लिए
    private int top = -1; // top pointer → -1 मतलब stack खाली (empty)

    public MyStack() {
        System.out.println("Constructor Called");
        this.arr = new int[5]; // default size = 5
    }

    public MyStack(int size) {
        // parameterized constructor → custom size stack बनाना
        this.arr = new int[size];
    }

    public boolean isEmpty() {
        if (top == -1) // अगर top -1 है → stack खाली
            return true;
        return false;
    }

    public boolean isFull() {
        return top == (arr.length - 1); // अगर top last index पर है → stack full
    }

    public void push(int val) {
        if (isFull()) { // अगर stack full है → push मत करो
            return;
        }
        top++; // top को increment करो
        arr[top] = val; // नया value insert करो
    }

    public int pop() throws Exception {
        if (isEmpty()) { // अगर stack खाली है → Exception throw करो
            throw new Exception("Stack is Empty");
        }
        int temp = arr[top]; // top element को temp में store करो
        arr[top] = 0; // optional: clear कर दिया
        top--; // top को एक step नीचे ले आओ
        return temp; // popped value return करो
    }

    public int peek() {
        if (isEmpty()) // अगर stack खाली है → -1 return करो
            return -1;
        return arr[top]; // वरना top element return करो
    }

    public void display() {
        if (isEmpty()) { // अगर stack खाली है → message print करो
            System.out.println("STACK is EMPTY!");
            return;
        }

        System.out.print("top ");
        for (int i = top; i >= 0; i--) { // top से bottom तक print करो
            System.out.print(arr[i] + " ");
        }
        System.out.println(" bottom");
        System.out.println();
    }
}