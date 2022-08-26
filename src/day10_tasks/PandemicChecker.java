package day10_tasks;

import java.util.Scanner;

public class PandemicChecker {
    /*
    Write a program that will read a number from the user. This number will be a year. Use that given year to figure out if there was a pandemic in that year, and if there was which one.
    Data to use:
        1346-1353: The Black Death
        1665-1666: Great Plague of London
        1770-1772: Russian plague
        1889-1890: Flu pandemic
        1916: American polio epidemic
        1918-1920: Spanish Flu
        2009-2010: H1N1 Swine Flu pandemic
        2014-2016: West African Ebola epidemic
        2020-2021: COVID-19
        Any year not in those ranges: No Pandemic
     */
    public static void main(String[] args) {
        System.out.println("Enter the year you need to check if it was a pandemic: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if(1346 <= year && year <= 1353 ){
            System.out.println(": The Black Death");
        } else if (1665 <= year && year <= 1666){
            System.out.println(": Great Plague of London");
        } else if(1770 <= year && year <= 1772){
            System.out.println(": Russian plague");
        }else if(1889 <= year && year <= 1890){
            System.out.println(": Flu pandemic");
        }else if(1916 == year){
            System.out.println(": American polio epidemic");
        }else if(1918 <= year && year <= 1920){
            System.out.println(": Spanish Flu");
        }else if(2009 <= year && year <= 2010){
            System.out.println(": H1N1 Swine Flu pandemic");
        }else if(2014 <= year && year <= 2016){
            System.out.println(": West African Ebola epidemic");
        }else if(2020 <= year && year <= 2021){
            System.out.println(": COVID-19");
        }else{
            System.out.println(": No Pandemic");
        }
    }
}
