package day09_tasks;

import java.util.Scanner;

public class IfVariables {
    public static void main(String[] args) {
       /* int a = 50;
        int b = 45;
        int c = 100;
       // boolean biggerNumber = a > b || a< b || a>c || b>c || c<b || c>a;
        if (a>b && a>c){
            System.out.println(a + " is the biggest");
        }
        if(b>a && b>c){
            System.out.println(b + " is the biggest");
        }
        if(c>b && c>a){
            System.out.println(c + " is the biggest");
        }

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a>b && a>c){
            System.out.println(a + " is the biggest");
        }
        if(b>a && b>c){
            System.out.println(b + " is the biggest");
        }
        if(c>b && c>a){
            System.out.println(c + " is the biggest");
        }

    }
}
