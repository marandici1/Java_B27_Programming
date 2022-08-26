package day09_tasks;

import java.util.Scanner;

public class TimeOfTheDay {
    /*create an int value for the time of the day. Use a 24 hour format
    use the given time of day to display a message
    hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23 or 0 - 5, print: Good night
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time");
        int time = input.nextInt();
        String message = "";

        if(6 <= time && time <= 11){
            message = "Good morning";
        }
        else if(12 <=time && time <= 16){
            message = "Good evening";
        }
        else if(17 <= time && time <= 23 || 0 <= time && time <=5){
            message ="Good night";
        }
        System.out.println(message);

    }
}
