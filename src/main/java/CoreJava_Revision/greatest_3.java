package CoreJava_Revision;

public class greatest_3 {
    public static void main(String[] args) {
        int a=23;
        int b=90;
        int c=9;

        int max=Math.max(a,Math.max(b,c));
        System.out.println(max);

        if(a>=b && a>=c){
            System.out.println("a greatest: "+a);
        }else if(b>=a && b>=c){
            System.out.println("b greatest: "+b);
        }else{
            System.out.println("c greatest: "+c);
        }
    }
}
