package day37_static_methods.iphone;

public class iphone {
    //instance variable
    String model;
    String color;
    double price;
    int storage;

    //static variable
    static String os;
    static String brand;

    //static block used to initialized static variables
    static{
        System.out.println("STATIC BLOCK RUN");
        os = "IOS";
        brand = "Apple";
    }

    // constructor used to initialize instance variables
    public iphone(String model, String color, double price, int storage){
        System.out.println("Constructor run");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;

    }

    @Override
    public String toString() {
        return "iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
