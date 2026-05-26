package CoreJava_Revision;

public class MultiDimArray {
    public static void main(String[] args) {
        Object a[][]=new Object[2][3];
        a[0][0]="apple";
        a[0][1]=45;
        a[0][2]=true;
        a[1][0]=12;
        a[1][1]=null;
        a[1][2]=4;
        System.out.println(a[1].length);

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("===================");

        for(Object x[]:a){
            for(Object res:x){
                System.out.print(res+" ");
            }
            System.out.println();
        }

    }
}
