package day12_switch_if;

public class Browsers {
    public static void main(String[] args) {
        String browser = "safari";

        switch (browser){
            case "chrome":
                System.out.println("opening google in chrome");
                break;
            case "firefox":
                System.out.println("opening google in firefox");
                break;
            case "safari":
                System.out.println("Special set up for apple computers");
                System.out.println("Opening in safari");
                break;
            default:
                System.out.println("Opening in chrome by default");
        }



    }
}
