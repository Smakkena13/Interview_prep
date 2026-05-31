package CoreJava_Revision;

public class printDuplicateEleArray {
    public static void main(String[] args) {
        int z[]={1, 2, 3, 2, 4, 3, 5};

        for(int i=0;i<z.length;i++){
            for(int j=i+1;j<z.length;j++){
                if(z[i]==z[j]){
                    System.out.print("duplicate "+z[i]+" ");
                }
            }
        }
    }
}
