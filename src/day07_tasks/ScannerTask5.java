package day07_tasks;

import day05_tasks.SalaryCalculator;

import java.util.Scanner;

public class ScannerTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
    hourly rate = salary / (hours weekly * 52)

         */

        System.out.println("Salary : ");
        double salary = input.nextDouble();
        System.out.println("Numbers of hours: $" );
        int numbersOfHours = input.nextInt();
        System.out.println("Hourly rate: " + salary / (numbersOfHours * 52));







    }
}
