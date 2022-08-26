package day19_tasks;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {



        //WRITE YOUR CODE BELOW
        //'a','e','i','o','u';
        String str ="This is a test";
        for(int i=0;i <str.length();i++){
            if((str.charAt(i) == 'a') ||
                    (str.charAt(i) == 'e')  ||
                    (str.charAt(i) == 'i') ||
                    (str.charAt(i) == 'o') ||
                    (str.charAt(i) == 'u')) {
                System.out.println(" The String contains " + str.charAt(i));
            }
        }

    }}
