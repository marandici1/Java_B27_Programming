package day16_strings;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine().toLowerCase();
        System.out.println("Enter your first name: ");
        String lastName = input.nextLine().toLowerCase();

        firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName= lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println(firstName +" " + lastName);





    }
}