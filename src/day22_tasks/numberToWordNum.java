package day22_tasks;

import java.util.Scanner;

public class numberToWordNum {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        String [] str = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen", "fifteen"};
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        if (num >0 && num<= 15) {
            System.out.println(str[num - 1]);
        } else{
            System.out.println("Your number is not in the range");
        }
    }
}
