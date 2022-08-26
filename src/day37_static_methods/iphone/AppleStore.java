package day37_static_methods.iphone;

public class AppleStore {
    public static void main(String[] args) {

        System.out.println(iphone.brand);

        iphone iphone1 = new iphone("IPhone X", "Block", 1000, 256);
        System.out.println(iphone1);
        System.out.println(iphone.brand);
        System.out.println(iphone.os);

        //we could use the object to access to static variables, but better to use the class name

        iphone iphone2 = new iphone("IPhone 7", "Silver", 1000, 256);
        System.out.println(iphone2);
    }
}
