package day18_tasks;

import java.util.Scanner;

public class multipleFactor {
    public static void main(String[] args) {
        //write a program that calculates the factorial of a number:
        //    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your factorial number: ");
        int num = input.nextInt();
        int count =num;
        while(count-- <= num && count >=1) {
            num *= count;


        }
        System.out.println("Result: " + num);
    }
}
