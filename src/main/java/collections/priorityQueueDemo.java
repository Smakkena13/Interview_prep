package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue p=new PriorityQueue();
        p.add("happ");
        p.add("apple");
        p.add("kite");
        p.add("kite");
//        p.add(null);
        p.add("cat");
        p.add("lion");
        p.offer("lolli");
        System.out.println(p);

        System.out.println(p.element());
        System.out.println(p.peek());

        System.out.println(p.remove());
        System.out.println(p.poll());

        Queue q=new PriorityQueue();
        q.add(12);
        q.add(10);
        q.add(8);
        q.add(17);
        q.add(1);
//        q.offer("hi");
        System.out.println(q);

    }
}
