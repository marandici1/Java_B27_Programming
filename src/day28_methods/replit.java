package day28_methods;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Please enter the guest's name:");
        String name = input.nextLine();
        System.out.println("Do you want to enter another guest's name?");
        String enter = input.nextLine();
    //WRITE YOUR CODE BELOW
        for (int i = 0; i >1 ; i++) {
            System.out.println("Do you want to enter another guest's name?");
            String entered = input.nextLine();
           String answer = "yes";
           name += ", ";

           if (enter == answer) {
               System.out.println("Please enter the guest's name:");
               String name2 = input.nextLine();
           }


           else {
               System.out.println("Guests' list: " + name);
           }
       }
    }

}
