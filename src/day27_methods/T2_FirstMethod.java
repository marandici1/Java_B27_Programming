package day27_methods;

public class T2_FirstMethod {
    public static void helloWorld(){
        System.out.println("Hello  world!");

    }
    public static void helloWorld5(){
        for(int i = 0; i<5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
helloWorld();
helloWorld();

        System.out.println();

        for(int i = 0; i<5; i++){
            helloWorld();
        }
        System.out.println();

        helloWorld5();
        helloWorld5();
    }

}
