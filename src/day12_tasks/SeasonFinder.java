package day12_tasks;

import java.util.Scanner;

public class SeasonFinder {
    /*
    Season Finder
declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month
	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall
Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int storagePrice = 0;
        System.out.println("Seclect storage type:");
        String type = input.nextLine();
        System.out.println("Seclect storage size:");
        String size = input.nextLine();

        if ( type == "SSD" && size == "500"){
            storagePrice = 100;}

        else if ( type == "SSD" && size == "1000"){
            storagePrice = 200;}

        else if ( type == "HDD" &&  size == "500"){
            System.out.println(storagePrice = 50); }

        else if ( type == "HDD" && size == "1000"){
            storagePrice = 100;}
        System.out.println(storagePrice);
    }
}
