package CoreJava;

public class evenOddArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        for(int x:a){
            if(x%2==0){
                System.out.print(x+" even ");
            }else{
                System.out.print(x+" odd ");
            }
        }
    }
}
