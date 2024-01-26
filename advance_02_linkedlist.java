import java.util.*;

public class advance_02_linkedlist {
    public static void main(String[]args){
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.addFirst(150);
        l1.addLast(250);
        l1.clone();

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.addFirst(100);
        l2.addLast(200);
        l1.addAll(l2);
        
        for(int i =0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
