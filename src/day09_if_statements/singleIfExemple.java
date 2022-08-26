package day09_if_statements;

public class singleIfExemple {
    public static void main(String[] args) {
        if(true){
            System.out.println("Hello"); // when the boolean is true this printing
        }
        System.out.println("break"); //normal print, not part of any if
        if(false){
            System.out.println("Bye");
        }
        System.out.println("--------------------");
        int year = 2020;

        if(year == 2020 || year ==2021) {
            System.out.println("Stay home");
    System.out.println("Wash your hands");
            System.out.println("social distance");

        }
 System.out.println("---------------------");
        double price =39.99;
if(price >= 20){
            System.out.println("Free shipping");
        }
    }
}
