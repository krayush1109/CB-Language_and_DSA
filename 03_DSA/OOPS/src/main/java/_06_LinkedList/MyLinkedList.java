package _06_LinkedList;

/*
    🚆 Mnemonic (Train Analogy)
    - Head = Engine (शुरुआत)
    - Tail = Last Coach (अंत)
    - Next = Coupler (कड़ी)
*/

class Node {
    int val; // data store करता है
    Node next; // अगला node की कड़ी (link)
}

public class MyLinkedList {
    private Node head; // पहला node (शुरुआत)
    private Node tail; // आख़िरी node (अंत)
    private int size; // कितने nodes हैं list में

    // Constructor → शुरुआत में list खाली है
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // ADD AT FIRST → नया node हमेशा head पर add होगा
    public void addFirst(int item) {
        Node newNode = new Node();
        newNode.val = item;
        newNode.next = this.head; // नया node पुराना head से जुड़ गया

        this.head = newNode; // head अब नया node है
        size++;

        if (tail == null) { // अगर list खाली थी
            this.tail = newNode; // head और tail दोनों same होंगे
        }
    }

    // ADD AT LAST → नया node हमेशा tail पर add होगा
    public void addLast(int item) {
        Node newNode = new Node();
        newNode.val = item;
        newNode.next = null; // आख़िरी node का next हमेशा null

        if (head == null) { // अगर list खाली है
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode; // पुराना tail नए node से जुड़ गया
            this.tail = newNode; // tail अब नया node है
        }

        size++;
    }

    // REMOVE FIRST → head हटाना
    public int removeFirst() {
        
        // if (size == 0) {   // ALSO, size से check कर रहे हैं
        if (head == null) {
            System.out.println("LL is Blank");
            return -1;
        }

        Node temp = head; // पुराना head store कर लिया
        head = head.next; // head को अगले node पर shift कर दिया

        if (head == null) { // अगर list खाली हो गई
            tail = null;
        }

        size--;
        return temp.val; // हटाए गए node का value return
    }

    // REMOVE LAST → tail हटाना
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is EMPTY");
            return -1;
        }

        if (size == 1) { // सिर्फ़ एक node था
            Node temp = head;
            head = null;
            tail = null;
            size--;
            return temp.val;
        }

        // second-last node तक पहुँचो
        Node prevIdx = head;
        while (prevIdx.next != tail) {
            prevIdx = prevIdx.next;
        }

        Node temp = tail; // पुराना tail store कर लिया
        prevIdx.next = null; // second-last का next null कर दिया
        tail = prevIdx; // tail अब second-last node है

        size--;
        return temp.val; // हटाए गए node का value return
    }

    // DISPLAY → पूरी list print करना
    public void display() {
        Node currIdx = head;
        while (currIdx != null) {
            System.out.print(currIdx.val + " → ");
            currIdx = currIdx.next;
        }
        System.out.println("null");
    }

    // Tail getter
    public Node getTail() {
        return tail;
    }

    // Size getter
    public int getSize() {
        return this.size;
    }
}