package CoreJava;

public class searchElemArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,50,6};
        int search=5;
        boolean flag=false;

        for(int r:a){
            if(r==search){
                System.out.println("element found");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("element not found");
        }
    }
}
