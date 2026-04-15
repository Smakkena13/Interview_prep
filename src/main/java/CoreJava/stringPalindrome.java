package CoreJava;

public class stringPalindrome {
    public static void main(String[] args) {
        String s="happah";
        String orig=s;
        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(orig.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
