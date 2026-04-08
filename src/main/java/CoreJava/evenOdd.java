package CoreJava;

public class evenOdd {
    public static void main(String[] args) {
        int a=-7;
        if(a>0){
            System.out.println(a+" is positive");
            if(a%2==0){
                System.out.println(a+" is even");
            }else{
                System.out.println(a+" is odd");
            }
        }else if(a<0){
            System.out.println(a+" is negative");
            if(a%2==0){
                System.out.println(a+" is even");
            }else{
                System.out.println(a+" is odd");
            }
        }else{
            System.out.println(a+" is zero");
        }

    }
}
