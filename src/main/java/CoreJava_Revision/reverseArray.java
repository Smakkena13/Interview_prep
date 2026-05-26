package CoreJava_Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverseArray {
    public static void main(String[] args) {

        int a[]={12,3,45,67,23,97,5};
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

        System.out.println("======================");
        Integer b[]={23,4,56,13,25,64,83,6};
        ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(b));
        Collections.reverse(al);
        System.out.println(al);


    }
}
