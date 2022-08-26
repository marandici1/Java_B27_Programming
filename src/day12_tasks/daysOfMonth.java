package day12_tasks;

import java.util.Scanner;

public class daysOfMonth {
   /*
    Days In Month (slightly different version than before)
    Write a program that will accept a month name and outputs how many days are in that month
    data:
    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the month name: ");
       String months = input.nextLine();
       switch(months){
           case "January":
               System.out.println("31 days");
               break;
           case "February":
               System.out.println("28 days");
               break;
           case "March":
               System.out.println("31 days");
               break;
           case "April":
               System.out.println("30 days");
               break;
           case "May":
               System.out.println("31 days");
               break;
           case "June":
               System.out.println("30 days");
               break;
           case "July":
               System.out.println("31 days");
               break;
           case "August":
               System.out.println("31 days");
               break;
           case "September":
               System.out.println("30 days");
               break;
           case "October":
               System.out.println("31 days");
               break;
           case "November":
               System.out.println("30 days");
               break;
           case "December":
               System.out.println("31 days");
               break;

               /*
               switch (month) {

            case "February":
                System.out.println("28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid month");
                */

       }
   }
}

