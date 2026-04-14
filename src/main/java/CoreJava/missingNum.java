package CoreJava;

import java.util.Arrays;

public class missingNum {
    public static void main(String[] args) {
        int[] a={4,5,1,2};
        int n=a.length+1;
        int expsum=n*(n+1)/2;

        int sum=0;
        for(int r:a){
            sum=sum+r;
        }
        System.out.println("sum: "+sum);
        System.out.println("expsum: "+expsum);
        System.out.println("missing: "+(expsum-sum));

    }
}
