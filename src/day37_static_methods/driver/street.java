package day37_static_methods.driver;

public class street {
    public static void main(String[] args) {
        Car bmw = new Car("X5", "Veronica", 567456, 'C');
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);
        System.out.println(bmw.model);

    }
}
