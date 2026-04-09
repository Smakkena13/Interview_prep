package CoreJava;

public class switchPrmg {
    public static void main(String[] args) {
        String a="chrome";
        int b=20;
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
        switch (b){
            case 10:
                System.out.println("10 is selected");
                break;
            case 20:
                System.out.println("20 is selected");
                break;
             default:
                 System.out.println("no number is selected");
        }
    }
}
