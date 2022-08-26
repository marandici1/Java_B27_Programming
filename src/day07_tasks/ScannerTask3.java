package day07_tasks;

import java.util.Scanner;

public class ScannerTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
         */

        System.out.println("Angel number 1 is: ");
        double angleNumber1= input.nextDouble();
        System.out.println("Angel number 2 is: ");
        double angleNumber2= input.nextDouble();
        System.out.println("Angel number 3 is: ");
        double angleNumber3= input.nextDouble();

        boolean isTriangle = (angleNumber1 + angleNumber2 + angleNumber3) == 180;
        System.out.println("Is Triangle : " + isTriangle);
        boolean isCircle = (angleNumber1 + angleNumber2 + angleNumber3) == 360;
        System.out.println("Is Circle : " + isCircle);



    }
}
