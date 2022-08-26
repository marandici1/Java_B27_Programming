package day07_tasks;

import java.util.Scanner;

public class ScannerTask1 {
    public static void main(String[] args) {
        /* Create a program that will ask the user to enter two numbers. Add the numbers and print the result

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int number1 = input.nextInt();
        System.out.println("Enter second number : ");
        int number2 = input.nextInt();
        System.out.println(number1 + number2);

    }
}
