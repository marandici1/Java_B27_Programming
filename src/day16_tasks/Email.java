package day16_tasks;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cydeo.com” and print the final string as your created email.
The final email should be in all lowercase.
    input
        JamesBond
        Secret
    output:
        jameret@cydeo.com
         */
        String name1 = input.nextLine().toLowerCase();
        String name2 = input.nextLine().toLowerCase();

        if (name1.length()>=6 && name2.length()>=6){
            name1 = name1.substring(0,4);
            name2 =name2.substring(3,6);

        }
        else{
            System.out.println("Invalid data");
        }
        System.out.println("" + name1 + name2 + "@cydeo.com" );
    }
}
