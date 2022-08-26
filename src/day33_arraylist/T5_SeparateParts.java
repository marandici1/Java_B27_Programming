package day33_arraylist;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.Arrays;

public class T5_SeparateParts {
    /*
    Separate Parts
Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
Ex:  str = "ABCD123$%#@&456EFG!"
     list1: {$, %, #, @, &, !}
     list2: {A, B, C, D, E, F, G}
     list3: {1, 2, 3, 4, 5, 6}
     */

    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(letters);
        letters.removeIf(p -> !Character.isLetter(p.charAt(0))); // p is every element, every element each character of the String, but those characters were String type, so in order to get a char type we did charAt(0). Character methods needed char type.
        System.out.println("list: "  + letters);
    }
}
