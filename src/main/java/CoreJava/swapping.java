package CoreJava;

public class swapping {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;

        //expected b=10,a=20
//        c=a;
//        a=b;
//        b=c;

//        a=a+b; //10+20=30
//        b=a-b; //30-20=10
//        a=a-b; //30-10=20

        //xor also

        a=a*b; //10*20=200
        b=a/b; //200/20=10
        a=a/b; //200/10=20


        System.out.println("after swapping a="+a);
        System.out.println("after swapping b="+b);
    }
}
