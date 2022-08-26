package day11_nested;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW:
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Enter first number:");
        a = input.nextInt();
        System.out.println("Enter second number:");
        b = input.nextInt();
        System.out.println("Enter third number:");
        c = input.nextInt();

        if(a > b && a < c || a < b && a > c){
            System.out.println("middle number is:" + a);
        }if(a > b && a < c || a < b && a > c){
            System.out.println("middle number is:" + a);
        }else if(b > a && b < c || b < a && b > c){
            System.out.println("middle number is:" + b);
        } else if(c > b && c < a || c < b && c > a){
            System.out.println("middle number is:" + c);}
    }
}
