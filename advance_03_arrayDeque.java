import java.util.*;

public class advance_03_arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        ad1.add(2);
        ad1.add(3);
        ad1.add(4);
        ad1.addFirst(10);
        System.out.print(ad1);
        System.out.println(ad1.getFirst());
    }
}
