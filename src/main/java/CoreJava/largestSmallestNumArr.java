package CoreJava;

public class largestSmallestNumArr {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,6};
        int largest=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("largest: "+largest);

        int[] b={10,20,30,40,50,6};
        int smallest=b[0];
         for(int i=1;i<b.length;i++){
             if(b[i]<smallest){
                 smallest=a[i];
             }
         }
        System.out.println("smallest: "+smallest);
    }
}
