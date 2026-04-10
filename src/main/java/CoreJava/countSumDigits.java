package CoreJava;

public class countSumDigits {
    public static void main(String[] args) {
        int num=1234566;

        int ecount=0;
        int ocount=0;
        int sum=0;
        while(num!=0){
            int rem=num%10; //5,4,3,2,1
            if(rem%2==0){
                ecount++;
            }else{
                ocount++;
            }
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("even count: "+ecount+ " even count: "+ocount);
        System.out.println("sum: "+sum);
    }
}
