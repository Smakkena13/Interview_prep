package CoreJava;

public class counteven {
    public static void main(String[] args) {
        int ecount=0;
        int ocount=0;
        for(int i=1;i<=11;i++){
            if(i%2==0){
                ecount++;
            }else {
                ocount++;
            }
        }
        System.out.println("even count: "+ecount);
        System.out.println("odd count: "+ocount);
    }
}
