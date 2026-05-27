package CoreJava_Revision;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a year");
        int year=sc.nextInt();

        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            System.out.println(year +"leap year");
        }else{
            System.out.println(year +"not a leap year");
        }
    }
}
