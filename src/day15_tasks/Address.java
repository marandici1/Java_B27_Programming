package day15_tasks;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Address {
    /*
  create a class Address
ask the user to enter their address as one input
check which street the house is on and which side of street
handle any extra spaces in the beginning or end of input address
at the end also print the address as all uppercase letters
	houses that have a house number starting with the numbers 500 are on the right side of the street while the address that start with the number 600 are on the left side of the street
	the street they are on is given in the address
		print the street by checking for these streets:
			drive: house on drive
			lane: house on lane
			ave: house on avenue
	Ex:
		Input:
			500312 road w drive, 98404
		Output:
			500312 ROAD W DRIVE, 98404
			house on the right side
			house on drive
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address");
        String address = input.nextLine();
        address= address.toUpperCase();
        address = address.trim();
        /*
        at this point we create the address form the console
        made all the characters uppercase
        and removed extra spaces from the beginning and end

        to do all the above steps at the same time we could also chain our methods

        String address = input.nextLine().toUpperCase().trim();
                                    string-> string ->string
                   Invalid use:
                   s,equals("address").trim()
                   boolean-> not going to string

         */
        System.out.println(address);
        if (address.startsWith("500")){
            System.out.println("house on the right side");
        }else if (address.startsWith("600")){
            System.out.println("house on the left side");
        }
        if (address.contains("Drive")){
            System.out.println("house on drive");
        }else if (address.contains("LANE")){
            System.out.println("house on drive");
        }else if (address.contains("ave")){
            System.out.println("house on avenue");
        }


    }
}
