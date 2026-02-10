package _02_stackIaB;

/*
    Q. Insert at Bottom
    -> 1. using extra stack O(n)
    -> 2. WITHOUT using extra stack O(1)
*/

public class MyStackIaB {
    public static int i = 19; // static variable → सभी objects share करेंगे

    private int arr[]; // array → stack elements store करने के लिए
    private int top = -1; // top pointer → -1 मतलब stack खाली (empty)

    public MyStackIaB() {
        System.out.println("Constructor Called");
        this.arr = new int[5]; // default size = 5
    }

    public MyStackIaB(int size) {
        // parameterized constructor → custom size stack बनाना
        this.arr = new int[size];
    }

    // 🎯 -> 1. using extra stack O(n)
    public void iab(int val) throws Exception { // insert at bottom
        MyStackIaB temp = new MyStackIaB(arr.length); // नया temporary stack बनाया

        if (isFull()) { // अगर stack full है → push मत करो
            throw new Exception("Stack is Already FULL!");
        }

        // Step 1: सारे elements original stack से निकालकर temp में डालो
        while (!isEmpty()) {
            temp.push(this.pop()); // pop करके temp में push
        }

        // Step 2: अब original stack खाली है → नया element डालो (bottom पर जाएगा)
        this.push(val);

        // Step 3: temp से वापस सारे elements original stack में डालो
        while (!temp.isEmpty()) {
            this.push(temp.pop()); // restore original order
        }
    }

    // 🎯-> 2. WITHOUT using extra stack O(1)
    public void iab_rec(int val) throws Exception { // recursion से insert at bottom
        if (this.isFull()) { // अगर stack full है → push मत करो
            throw new Exception("Stack is Already FULL!");
        }

        if (this.isEmpty()) { // base case: अगर stack खाली है
            this.push(val); // नया element डाल दो → यही bottom होगा
            return;
        }

        // Step 1: ऊपर का element निकालो
        int temp = this.pop();

        // Step 2: recursion से नीचे तक पहुँचो
        iab_rec(val);

        // Step 3: वापस ऊपर का element डाल दो
        this.push(temp);
    }

    // 3. REVERSE
    public void reverse() throws Exception {
        if (isEmpty()) {            
            return;
        }

        int temp = this.pop();            
        reverse();            
        iab_rec(temp);
    }

    // 🔷🔷🔷🔷🔷 ALREADY LEARNT PREVIOUSLY 🔷🔷🔷🔷🔷
    public boolean isEmpty() {
        if (top == -1) // अगर top -1 है → stack खाली
            return true;
        return false;
    }

    public boolean isFull() {
        return top == (arr.length - 1); // अगर top last index पर है → stack full
    }

    public void push(int val) throws Exception {
        if (isFull()) { // अगर stack full है → push मत करो
            throw new Exception("Stack is Empty");
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