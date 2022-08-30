package day41_exceptions.hidding;

public class Second extends First{


    public static void staticMethod() {
        System.out.println("Static methode from Second");
    }
    public void instanceMethodB(){
        staticMethod();
    }
}
