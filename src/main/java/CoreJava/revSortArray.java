package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class revSortArray {
    public static void main(String[] args) {
        int[] a={12,3,24,35,10,1};
        int start=a.length-1;

        for(int i=start;i>=0;i--){
            System.out.println(a[i]);
        }

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Integer[] b={23,2,43,1,54};
        List<Integer> li=new ArrayList<>(Arrays.asList(b));
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);

    }
}
