package day07_tasks;

import java.util.Scanner;

public class ScannerTask2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        /* Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
         */

        System.out.println("Enter the price is : ");
        double price = input.nextDouble();
        System.out.println("Enter the quantity is : ");
        int quantity = input.nextInt();
        System.out.println("The Revenue is:  = " + quantity * price);


    }
}
