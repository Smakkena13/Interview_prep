package CoreJava;

public class stringReverse {
    public static void main(String[] args) {
        String s="happy";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("reverse: "+rev);

        String b="apple";
        char[] c=b.toCharArray();
        String r="";
        for(int i=c.length-1;i>=0;i--){
            r+=c[i];
        }
        System.out.println("rev: "+r);

        StringBuilder s1=new StringBuilder("kappa");
        System.out.println(s1.reverse());

        StringBuffer s2=new StringBuffer("lion");
        System.out.println(s2.reverse());

    }
}
