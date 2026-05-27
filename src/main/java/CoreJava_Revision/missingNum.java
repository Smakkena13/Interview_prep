package CoreJava_Revision;

public class missingNum {
    public static void main(String[] args) {
        int a[]={1,2,3,5};
        int n=a.length+1;

        int expsum=(n*(n+1))/2;
        int sum=0;
        for(int r:a){
            sum=sum+r;
        }
        int missingnum=expsum-sum;
        System.out.println(missingnum);
    }
}
