package CoreJava_Revision;

public class Add2DArray {
    public static void main(String[] args) {
        int a[][]={
                {1,2,3},
                {4,5,6}
        };
        int sum=0;
        for(int b[]:a){
            for(int r:b){
                sum=sum+r;
            }
        }
        System.out.println(sum);
    }
}
