package CoreJava;

public class arraysEqual {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2={1,2,3,5};
        boolean flag=true;
        if(a1.length==a2.length){

            for(int i=0;i<a1.length;i++){
                if(a1[i]!=a2[i]){
                    flag=false;
                }
            }
        }else{
            flag=false;
        }
        if(flag==false){
            System.out.println("not equals");
        }else{
            System.out.println("equals");
        }
    }
}
