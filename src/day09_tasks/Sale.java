package day09_tasks;

import java.util.Scanner;

public class Sale {
    /* create a sales amount variable
use the sales amount to determine the bonus you get at end of the month
	if your sales amount is less than 10000 you don't get any bonus
	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000
	if your sales amount is more than or equal to 15000 you get a bonus of 7000
	print your bonus number
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the sales mount: ");
        double sales = input.nextDouble();
        if(sales<10000){
            System.out.println("You don't get any bonus");
        }
        if(10000 <= sales && sales < 15000 ){
            System.out.println("You get a bonus of 5000");
        }
        if(15000 <= sales){
            System.out.println("You get bonus of 7000");
        }

    }
}
