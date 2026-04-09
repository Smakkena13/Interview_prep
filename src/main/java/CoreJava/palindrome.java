package CoreJava;

public class palindrome {
    public static void main(String[] args) {
        int num=2020; //2020
        int original=num;
        int res=0;
        while(num!=0){
            int rem=num%10;
            num=num/10;
            res=res*10 + rem;
        }
        System.out.println(res); //202
        if(res==original){
            System.out.println(original+" is palindrome");
        }else{
            System.out.println(original+" is not palindrome");
        }

        //for leading 0's
        int num2=2112;
        String n=String.valueOf(num2);
        StringBuilder s1=new StringBuilder(n);
        String rev=s1.reverse().toString();
        System.out.println("rev: "+rev); //0110

        if(n.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
