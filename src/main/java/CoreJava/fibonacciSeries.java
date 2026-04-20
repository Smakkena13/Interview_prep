package CoreJava;

public class fibonacciSeries {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21
        int n1=0;
        int n2=1;
        int sum=0;
        System.out.print(n1+" "+n2);
        for(int i=2;i<10;i++){
            sum=n1+n2;  //0+1 , 1+1 ,1+2, 2+3
            System.out.print(" "+sum); //1, 2, 3, 5
            n1=n2; //1 1 2
            n2=sum; //1 2 3
        }
    }
}
