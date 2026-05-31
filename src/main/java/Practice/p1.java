package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class p1 {
    public static void main(String[] args) {
        //find maximum
        int a[]={12,4,56,3,7};
        int max=a[0];

        for(int r:a){
            if(r>max){
                max=r;
            }
        }
        System.out.println("max: "+max);

        //reverse array
        int b[]={1, 2, 3, 4, 5};
        for(int i=b.length-1;i>=0;i--){
            System.out.print(b[i]+" ");
        }
        System.out.println();

        //find sum
        int c[]={10, 20, 30, 40, 50};
        int sum=0;
        for(int res:c){
            sum=sum+res;
        }
        System.out.println(sum);

        //find missing
        int d[]={1, 2, 4, 5, 6};
        int n=d.length+1;
        int expsum=(n*(n+1))/2;

        int actsum=0;
        for(int q:d){
            actsum+=q;
        }
        int missing=expsum-actsum;
        System.out.println(missing);

        //find duplicates
        int z[]={1, 2, 3, 2, 4, 3, 5};
        for(int o=0;o<z.length;o++){
            for(int j=o+1;j<z.length;j++){
                if(z[o]==z[j]){
                    System.out.print("duplicate: "+z[o]+" ");
                }
            }
        }

    }
}
