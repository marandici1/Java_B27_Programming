package day06_tasks;

public class LeapYear {
    public static void main(String[] args) {
        /* reate a class LeapYear

    declare and assign a year variable
    check if the year is a leap year, a year will be a leap year if it is divisible by 4

         */
    int year = 2008;
        boolean isLeapYear = year % 4 == 0;
        System.out.println("The year " + year + " is a leap year: " + isLeapYear);

    }
}
