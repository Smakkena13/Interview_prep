package CoreJava_Revision;

public class SingleDimArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        int b[]={20,23,1,34,56};
        int ec=0;
        int oc=0;
        for(int j=0;j<b.length;j++){
            if(b[j]%2==0){
                ec++;
            }else{
                oc++;
            }
        }
        System.out.println("ec "+ec);
        System.out.println("oc "+oc);
    }
}
