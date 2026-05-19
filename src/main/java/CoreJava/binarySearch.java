package CoreJava;

public class binarySearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int l=0;
        int h=a.length-1;
        int search=100;
        boolean f=false;

        while(l<=h){
            int mid=(l+h)/2;

            if(search==a[mid]){
                System.out.println("element found");
                f=true;
                break;
            }
            if(search>a[mid]){
                l=mid+1;
            }
            if(search<a[mid]){
                h=mid-1;
            }
        }
        if (f == false) {
            System.out.println("element not found");
        }
    }
}
