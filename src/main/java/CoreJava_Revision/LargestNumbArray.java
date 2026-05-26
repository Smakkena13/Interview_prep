package CoreJava_Revision;

public class LargestNumbArray {
    public static void main(String[] args) {
        int a[]={12,3,45,67,23,97,5};
        int largest=a[0];

        for(int r:a){
            if(r>largest){
                largest=r;
            }
        }
        System.out.println("largest: "+largest);
    }
}
