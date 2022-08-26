package day10_tasks;

import java.util.Scanner;

public class Retake {
    /*
    create a class Retake
declare and assign a grade variable
declare and assign an attempt number
Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:
	If its the first attempt -> subtract 10%
	If its the second attempt -> subtract 20%
	If its the third attempt -> subtract 35%
Based on the retake attempt number calculate the final grade
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = 100;
        System.out.println("Enter the numbers of retake attempts: ");
        int attempt = input.nextInt();
        System.out.println("Your final grade is: ");
        if(attempt == 1){
            System.out.println(grade - (grade * 0.1));
        }else if (attempt == 2){
            System.out.println(grade - (grade * 0.2));
        }else if (attempt == 3){
            System.out.println(grade - (grade * 0.35));
        }else{
            System.out.println("You picked the test");
        }

    }
}
