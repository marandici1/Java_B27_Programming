package day09_tasks;

import java.util.Scanner;

public class monthsDay {
    public static void main(String[] args) {
        /*create a int variable to represent the month number, where 1 is Janurary and 12 is Decemeber.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each month:

	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
	Months that has 30 days: 4, 6, 9, 11
	Month that has 28 days: 2
	ex:
		12
		31 days
	ex:
		9
		30 days
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number");
        int a = input.nextInt();
        if(a == 1 || a == 3 || a == 5 || a ==7 || a ==8 || a==10 || a== 12){
            System.out.println("31 days");
        }
        else if(a == 4 || a == 6 || a == 9 || a == 11){
            System.out.println("30 days");
        }
        else {
            System.out.println("28 days");
        }
    }
}
