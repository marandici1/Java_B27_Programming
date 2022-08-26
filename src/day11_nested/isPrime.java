package day11_nested;

public class isPrime {
    public static void main(String[] args) {
        double price = 100.7;
        boolean isPrime = true;
        if (isPrime) {
            System.out.println("Free 2-3 days shipping");
        } else {
            if (price >= 25) {

                System.out.println("Free shipping is available");
            } else {
                System.out.println("Shipping cost is $2.99");
            }
        }
    }}
