package CoreJava;

public class countWordsString {
    public static void main(String[] args) {
        String a="apple ball cat dog elephat fish";
        String[] res=a.split(" ");
        int count=0;
        for(String r:res){
            System.out.println(r);
            count++;
        }
        System.out.println("count: "+count);
    }
}
