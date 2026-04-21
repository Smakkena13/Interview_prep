package CoreJava;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] a={4,5,1,2,2,13,2,4,4,6,1,1,11,1};

        Set<Integer> s=new HashSet<>();

        for(int res:a){
            s.add(res);
        }
        System.out.println(s);
    }

    }

