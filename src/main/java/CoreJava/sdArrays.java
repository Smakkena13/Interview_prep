package CoreJava;

public class sdArrays {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]=new int[5];
        b[0]=10;
        b[1]=20;
        b[2]=30;
        b[3]=40;
        b[4]=50;

        System.out.println(b.length);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

        for(int x:a){
            System.out.println(x+" ");
        }

    }
}
