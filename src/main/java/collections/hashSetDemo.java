package collections;

import java.util.*;

public class hashSetDemo {
    public static void main(String[] args) {
        Set al=new HashSet();
        Set s=new HashSet(40,(float)0.80);
        al.add("fpp");
        al.add("kpp");
        al.add("kpp");
        al.add(null);
        al.add("qpp");
        System.out.println(al);
        al.remove(null);


        ArrayList a=new ArrayList<>(al);
        Collections.sort(a);
        System.out.println(a);


    }
}
