package CoreJava;

public class largestOf3 {

    public static int findLargest(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }

    public static void main(String[] args) {
        int res=findLargest(12,23,14);
        System.out.println(res);

        int a=10;
        int b=8;
        int c=10;
        if(a>=b && a>=c){
            System.out.println("a is largest: "+a);
        }else if(b>=a && b>=c){
            System.out.println("b is largest: "+b);
        }else {
            System.out.println("c is largest: "+c);
        }

    }
}
