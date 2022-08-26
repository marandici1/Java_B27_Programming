package day10_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    /*
    [IQ]
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        if(n%5 == 0 && n%3 == 0){
            System.out.println("FizzBuzz");
        }else if( n % 5 ==0 ){
            System.out.println("Buzz");
        } else if(n%3 == 0){
            System.out.println("Fizz");
        }else {
            System.out.println(n);
        }

    }
}
