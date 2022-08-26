package day16_strings;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you first name");
        String firstName = input.next().toUpperCase();
        System.out.println("Enter your last name");
        String lastName = input.next().toUpperCase();

        String initials= "" + firstName.charAt(0) + lastName.charAt(0);
        System.out.println(initials);
    }
}
