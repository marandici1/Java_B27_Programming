package day11_tasks;

import java.util.Scanner;

public class bankpin {
    public static void main(String[] args) {
        int systemPin = 1234;
        int systemSsn = 1111;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode: ");
        int inputPin = input.nextInt();
        System.out.println("Please enter your last 4 ssn: ");
        int inputSsn = input.nextInt();

        if(systemPin == inputPin && systemSsn ==inputSsn){
            System.out.println("Authentication is successful ");
        }else {
            if(systemPin != inputPin){
                System.out.println("Pin code is incorrect");
            }
            if(systemSsn != inputSsn){
                System.out.println("Last 4 ssn is incorrect");
            }

        }
    }
}
