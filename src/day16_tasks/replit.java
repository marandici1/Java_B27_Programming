package day16_tasks;


import java.util.Scanner;


public class replit {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW
        boolean a =word.startsWith("a");
        boolean e = word.endsWith("e");

        if(word.startsWith("a") || word.endsWith("e")){
            System.out.println("Starts with a: " + a);
            System.out.println("Starts with e: " + e);
        }



        }

    }






