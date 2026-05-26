package CoreJava_Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortArray {
    public static void main(String[] args) {
        int a[]={12,3,45,67,23,97,5};
        System.out.println("before "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after "+Arrays.toString(a));

        Integer b[]={23,4,56,13,25,64,83,6};
        ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(b));
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

    }
}
