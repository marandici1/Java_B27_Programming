package day15_string;

public class CharAtMethod {
    public static void main(String[] args) {
        String s = "java";

        System.out.println("First char " + s.charAt(0));
        System.out.println("Second char " + s.charAt(1));
        System.out.println("Fourth char " + s.charAt(3));
        //System.out.println("Invalid char " + s.charAt(100));  100= not valid index in our String
        System.out.println("Lenght " + s.length());
        System.out.println("Last index: " + 3); // hard coding

        // reverse my String, hardcoded: goal is to see: avaj
        System.out.print(s.charAt(3));
        System.out.print(s.charAt(2));
        System.out.print(s.charAt(1));
        System.out.print(s.charAt(0));
        System.out.println();

        System.out.println( "" + s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0)); // with "" at the begging it will congagninate instead of addition

       
    }
}
