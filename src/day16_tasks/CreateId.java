package day16_tasks;

import java.util.Scanner;

public class CreateId {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2
    first name: john
    last name: smith
    id: jSmi8
 */
        System.out.println("Enter your first name: ");
        String fName = input.nextLine().toLowerCase();
        int id = fName.length()*2;
        System.out.println("Enter your last name: ");
        String lName = input.nextLine().toLowerCase();
        fName=fName.substring(0,1);
        lName = lName.substring(0,1).toUpperCase() + lName.substring(1,3).toLowerCase();

        System.out.println("" + fName +lName +id);
    }
}
