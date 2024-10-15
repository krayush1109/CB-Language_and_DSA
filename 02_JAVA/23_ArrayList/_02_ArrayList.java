import java.util.*;

public class _02_ArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(22);
        list.add(33);
        
        System.out.println(list);
        System.out.println(list.contains(45));
        System.out.println(list.contains(22));

        list.remove(1); // removing index 1 from the list
        System.out.println(list.contains(22));

    }
}