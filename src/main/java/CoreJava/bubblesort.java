package CoreJava;

import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int[] a={10,45,23,100,42};
        System.out.println(Arrays.toString(a));
//        int passes=;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
