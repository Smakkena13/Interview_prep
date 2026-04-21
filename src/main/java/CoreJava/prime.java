package CoreJava;

public class prime {
    public static void main(String[] args) {
        int num=15;
        int count=0;

        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("prime number");
            }else{
                System.out.println("not prime number");
            }
        }else{
            System.out.println("number is less than 1");
        }
    }
}
