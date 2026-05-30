package CoreJava_Revision;

import java.util.Arrays;

public class equalityArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={1,2,3,4,9};
        boolean flag=false;

        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    flag=true;
                }
            }
        }else{
            flag=true;
        }

        if(flag==true){
            System.out.println("arrays are not equal");
        }
        if(flag==false){
            System.out.println("arrays are equal");
        }

        int ab[]={1,2,3,4,9};
        int bc[]={1,2,3,4,9};
        System.out.println(Arrays.equals(ab,bc));

    }
}
