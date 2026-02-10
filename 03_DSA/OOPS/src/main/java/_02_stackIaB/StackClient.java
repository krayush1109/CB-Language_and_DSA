package _02_stackIaB;
 
public class StackClient {
    
    public static void main(String[] args) throws Exception {
        MyStackIaB s = new MyStackIaB(5);

        s.push(15);
        s.push(20);
        s.push(30);
        // s.push(30);
        // s.push(30);
        // s.push(30);

        s.display();

        // 🎯 -> 1. using extra stack O(n)
        // s.iab(11);
        // s.iab(22);
        // s.iab(33);
        // s.display();        

        // 🎯-> 2. WITHOUT using extra stack O(1)
        s.iab_rec(99);
        s.iab_rec(999);

        s.display();

        // ❓ Q. Reverse a Stack ?
        s.reverse();

        s.display();
    }
    


}
