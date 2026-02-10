package _01_stack;

public class StackClient {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello");
        System.out.println(MyStack.i);

        // MyStack s = new MyStack();
        MyStack s2 = new MyStack(10);

        try {
            System.out.println(s2.isEmpty());

            s2.push(12);
            s2.push(24);
            s2.push(36);
            // s2.push(48);

            s2.display();

            System.out.println(s2.pop());

            s2.display();

            System.out.println(s2.peek());

            System.out.println("end of the try-block.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("END OF PROGRAM");

    }
}
