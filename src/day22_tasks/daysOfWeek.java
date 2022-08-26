package day22_tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class daysOfWeek {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] str = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satuday", "Sunday"};
        System.out.println("Enter your number for the day of the week: ");
        int num = input.nextInt();
        System.out.println(str[num-1]);

    }
}
