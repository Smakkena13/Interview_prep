package CoreJava;

public class sumOfArrays {
    public static void main(String[] args) {
        int a[][]={         //3rows 4cols
                {1,2,3,6},
                {4,5,6,15},
                {7,8,9,25}
        };
        int s=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                s=s+a[i][j];
            }
        }
        System.out.println(s);
        int sum=0;
        for(int b[]:a){
            for(int r:b){
                sum=sum+r;
            }
        }
        System.out.println(sum);
    }
}
