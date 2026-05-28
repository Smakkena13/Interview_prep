package CoreJava_Revision;

public class findDuplicatesArray {
    public static void main(String[] args) {
        int a[]={1,3,4,23,54,30};
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("no duplicates");
        }
        if(flag==true){
            System.out.println("duplicates found");
        }
    }
}
