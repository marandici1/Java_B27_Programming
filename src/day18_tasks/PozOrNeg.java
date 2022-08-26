package day18_tasks;

import java.util.Scanner;

public class PozOrNeg {
    public static void main(String[] args) {
        //write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
        int num = 0;
        int poz = 0;
        int neg = 0;
        Scanner input = new Scanner(System.in);

        while (num++ < 5) {
            System.out.println("Enter your number:");
            int number = input.nextInt();
            if (number > 0) {
                poz += 1;


            } else if (number < 0) {
                neg += 1;
            }
        }
        System.out.println("Negative: " + neg);
        System.out.println("Pozitie: " + poz);


    }
}
