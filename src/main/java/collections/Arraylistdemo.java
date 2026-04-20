package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistdemo {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add("fpp");
        al.add("kpp");
        al.add(null);
        al.add("qpp");
        al.add("qpp");
        al.add("epp");
        al.add(null);
        al.add("tpp");
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        al.add(2,"hello");
        al.set(1,"bye");
        System.out.println(al.contains("bye"));

        System.out.println("============");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("============");
        for(Object o:al){
            System.out.println(o);
        }
        System.out.println("============");
        Iterator i=al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("============");
        ArrayList al1=new ArrayList();
        al1.add("happy");
        al1.add("bye");
        al1.add(null);
        al1.add("toy");
        al1.add("park");
        al1.add("egg");

        ArrayList al2=new ArrayList();
        al2.add("cap");
        al2.add("ball");

        al2.addAll(al1);
        System.out.println(al2);
        al2.removeAll(al1);
        System.out.println(al2);

        System.out.println("=======");
        Integer[] a={10,3,23,1,45};
        ArrayList li=new ArrayList(Arrays.asList(a));
        System.out.println(li);

        Collections.sort(li);
        System.out.println(li);
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);



    }
}
