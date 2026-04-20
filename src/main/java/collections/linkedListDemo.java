package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedListDemo {
    public static void main(String[] args) {
        List al=new LinkedList();
        al.add("fpp");
        al.add("kpp");
        al.add(null);
        al.add("qpp");
        System.out.println(al);

        al.addFirst("yooo");
        al.addLast("ZOOO");
        System.out.println(al);
        System.out.println(al.getFirst());
        System.out.println(al.getLast());

        al.removeFirst();
        al.removeLast();
        System.out.println(al);


    }
}
