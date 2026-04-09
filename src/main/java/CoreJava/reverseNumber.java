package CoreJava;

public class reverseNumber {
    public static void main(String[] args) {
        int num=12345;
        int result=0;

        while(num!=0){
            int remainder=num%10; //5
            num=num/10; //1234
            result=result*10+remainder; //0*10+5=5, 5*10+4=54, 54*10+3=543, 543*10+2=5432, 5432*10+1=54321
        }
        System.out.println(result);

        //string reverse
        StringBuilder s=new StringBuilder("00789600");
        s.reverse();
        System.out.println(s);

        //numreverse
        int num1=2345600;
        String a=String.valueOf(num1);
        StringBuffer s1=new StringBuffer(a);
        System.out.println(s1.reverse());
    }
}
