package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {


        String day = "Tuesday";
        System.out.println(day.length()); // counts how many character there is
        String day2 = "Friday";
        int len = day2.length(); // length() method gives back int type, so we can use it however we want
        System.out.println(len);

        String str = " hello "; // the character 'hello' are 5 long but spaces are also character, so the space in the beginning and end are included, which means the total length is 7
        System.out.println(str.length()); // prints how many characters the String has, not the String
        // print(7)
        System.out.println(str);

        System.out.println("------------------------------------");

    }
}
