package day11_tasks;

import java.util.Scanner;

public class MoviePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the duration of your movie: ");
        double duration = input.nextDouble();
        if(duration<= 0){
            System.out.println("Movies cannot be less than 0 minutes");
        }else if(duration>= 4){
            System.out.println("Movies cannot be more than 4 hours");
        }if(duration ==1.0){
            System.out.println("Price will be: 8.99");
        }else if(duration ==1.5){
            System.out.println("Price will be: 10.50");
        }else if(duration ==2.0){
            System.out.println("Price will be: 12.99");
        }else if(duration ==2.5){
            System.out.println("Price will be: 14.50");
        }else if(duration ==3.0 || duration==3.5 || duration==4){
            System.out.println("Price will be: 15.99");
        }
    }
}
