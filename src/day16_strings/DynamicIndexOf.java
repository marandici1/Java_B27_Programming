package day16_strings;

public class DynamicIndexOf {
    public static void main(String[] args) {

        String str = "definition";

        System.out.println("Fisrt i " + str.indexOf('i'));
        System.out.println("Last i " + str.lastIndexOf('i'));

        System.out.println("other use of indexOf: ");

        System.out.println("Fisrt i " + str.indexOf('i'));
        System.out.println("Second i: " + str.indexOf('i',4)); //let know the program to start to search with the next character 4 to search for the second letter i


        System.out.println("Dynamic");

        int firstI = str.indexOf('i');
        int secondI = str.indexOf('i', firstI +1); // take previous index and add 1 to it, so we can start looking for the next occurrence
       int thirdI = str.indexOf('i', secondI + 1);

        System.out.println("1 i => " + firstI);
        System.out.println("2 i => "+ secondI);
        System.out.println("3 i => " + thirdI);
    }
}
