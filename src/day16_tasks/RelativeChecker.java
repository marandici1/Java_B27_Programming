package day16_tasks;

import java.util.Scanner;

public class RelativeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Given two full names check if the two people are related. They will be considered to be related if they have the same last name
    Input:
        James Bond
        Jamie Bond
    Output:
        Related
    Input:
        James Bond
        Alex Benji
    Output:
        Not Related
         */
        System.out.println("Enter your full name: ");
        String fName = input.nextLine();
        System.out.println("Enter your friend name: ");
        String sName = input.nextLine();

        if (fName.contains("bond") == sName.contains("bond")) {
            System.out.println("Related");
        }else{
            System.out.println("Not related");
        }
        /*
        String name1 = "JAMES BOND";
        String name2 = "Jamie BOND"
        int indexOfSpace = name1.lastIndexOf(' ');
        String lastName = name1.substring(indexOfSpace + 1);
        if (name2.endsWith(lastName));
        System.out.println( related");
        }else{
            System.out.println("Not related");
         */



    }
}
