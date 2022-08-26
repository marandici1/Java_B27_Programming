package day09_tasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
       /* int num1 = 50;
        int num2 = 45;
        if(num1>num2){
            System.out.println(num1 + " is bigger" );
        }
        if(num2>num1){
            System.out.println(num2 + " is bigger");
        }

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 =input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();
        boolean bigNumber = num1 > num2 || num1 < num2;

        if(bigNumber){
            System.out.println(num1 + " is bigger");

        }else {
            System.out.println(num2 + " is smaller");
        }
    }
}
