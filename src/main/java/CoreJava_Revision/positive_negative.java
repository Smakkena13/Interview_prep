package CoreJava_Revision;

import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        try{
            int a=sc.nextInt();
            if(a>0){
                System.out.println("number is +ve");
            }else if(a<0){
                System.out.println("number is -ve");
            }else{
                System.out.println("number is 0");
            }
        }catch(Exception e){
            System.out.println("meassage: "+e.getMessage());
        }

    }
}
