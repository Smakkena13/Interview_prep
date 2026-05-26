package CoreJava_Revision;

public class SmallNumArray {
    public static void main(String[] args) {
        int a[]={12,30,45,67,23,97,5};
        int small=a[0];

        for(int r:a){
            if(r<small){
                small=r;
            }
        }
        System.out.println("small: "+small);
    }
}
