package _06_LinkedList;

public class LLclient {
    public static void main(String[] args){

        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        
        if (ll.getTail() != null) {
            System.out.println("TAIL: " + ll.getTail().val);
        }
        
        // ll.addLast(99);
        // ll.addLast(105);
        
        ll.display();
        
        // System.out.println("Removed Element: " + ll.removeFirst());
        // System.out.println("Removed Element: " + ll.removeFirst());
        // System.out.println("Removed Element: " + ll.removeFirst());
        // System.out.println("Removed Element: " + ll.removeFirst());

        System.out.println("Size: " + ll.getSize());

        System.out.println("Removed Element: " + ll.removeLast());
        System.out.println("Removed Element: " + ll.removeLast());
        System.out.println("Removed Element: " + ll.removeLast());
        System.out.println("Removed Element: " + ll.removeLast());
        
        System.out.println("Size: " + ll.getSize());

        ll.display();        
    }
}
