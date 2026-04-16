package CoreJava;

public class removeJunk {
    public static void main(String[] args) {
        String s="#$#@!BCK!@ @#%)_+)_apple 1234";
        String s1=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);

        String q="java         python        qa        auto";
        String s2=q.replaceAll("\\s+"," ");
        System.out.println(s2);
    }
}
