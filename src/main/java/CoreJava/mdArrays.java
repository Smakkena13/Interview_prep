package CoreJava;

public class mdArrays {
    public static void main(String[] args) {
        int a[][]={         //3rows 4cols
                {1,2,3,6},
                {4,5,6,15},
                {7,8,9,25}
        };
        int b[][]=new int[2][3];
        b[0][0]=10;
        b[0][1]=20;
        b[0][2]=30;
        b[1][0]=40;
        b[1][1]=50;
        b[1][2]=60;

        System.out.println(b.length); //rows
        System.out.println(b[0].length); //cols

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=============");

        for(int x[]:a){
            for(int r:x){
                System.out.print(r+" ");
            }
            System.out.println();
        }

    }
}
