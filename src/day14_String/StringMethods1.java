package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String item = "pen"; // in String pool
        String item2 = new String("pen"); // directly in heap
        System.out.println(item == item2); // checks if the object item is the same object as item2

        String item3 = new String("pen");
        System.out.println(item2 == item3);// compares the two objects. They are both in the heap
        // .equals(): compare the value of the Strings, which checks if the characters are the same
        System.out.println(item.equals(item2)); // checks the characters
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));

        System.out.println();
        System.out.println(item.equals("Pen")); // checks for exact characters including cases
        System.out.println(item.equalsIgnoreCase("Pen")); // check only for matching characters and ignores all the cases

        System.out.println("------------------------------------");
        String username = "jamesbond";
        String password = "BOND007";
        //System.out.println(username.equals("JAMESBOND"));
        System.out.println(username.equalsIgnoreCase("JAMESBOND"));
        System.out.println(password.equals("BOND007"));





    }
}
