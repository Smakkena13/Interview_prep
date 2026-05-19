package CoreJava;

import java.util.HashMap;
import java.util.HashSet;

public class sample {
    public static void main(String[] args) {
        int[] a={12,3,24,1,5};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[i]>a[j]){
                    int temp=a[j];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

    }
}
