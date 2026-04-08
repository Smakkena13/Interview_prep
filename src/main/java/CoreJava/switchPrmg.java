package CoreJava;

public class switchPrmg {
    public static void main(String[] args) {
        String a="chrome";
        switch(a){
            case "edge":
                System.out.println("edge is selected");
                break;
            case "chrome":
                System.out.println("chrome is selected");
                break;
            case "firefox":
                System.out.println("firefox is selected");
                break;
             default:
                 System.out.println("no browser is selected");
        }
    }
}
