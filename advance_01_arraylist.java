import java.util.*;

public class advance_01_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l2.add(36);
        l2.add(44);
        l1.addAll(l2);
        System.out.println(l1.contains(34));
        System.out.println(l1.indexOf(6));
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
