package CoreJava_Revision;

public class SearchElementArray {
    public static void main(String[] args) {
        int a[]={12,3,45,67,23,97,5};
        int search=970;
        boolean flag=false;
        for(int res:a){
            if(res==search){
                System.out.println("element found!!");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("element not found");
        }
    }
}
