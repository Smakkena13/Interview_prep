package CoreJava;

public class countOccChar {
    public static void main(String[] args) {
        String s="apple ball cat dog ellllllephat fish";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                c++;
            }
        }
        System.out.println(c);

        int t1=s.length();
        int t2=s.replace("l","").length();
        int total=t1-t2;
        System.out.println(total);
    }
}
