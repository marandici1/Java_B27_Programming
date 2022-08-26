package day15_tasks;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        /*create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'
	Ex:
		"java"
		"mouse"
		"computer"
	Output: java
Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 String inputs: ");
        String first = input.next();
        String second = input.next();
        String third = input.next();
        int firstint = first.length();
        int secondint = second.length();
        int thirdint = third.length();
        char letter = 'o';
        String result = "";
        if (secondint > firstint && secondint > thirdint || second.contains("" + letter)) {

            result = second;
        }  if (firstint > secondint && firstint > thirdint || first.contains("" + letter)) {

            result = first;
        }  if (thirdint > firstint && thirdint > secondint || third.contains("" + letter)) {

            result= third;
        }
        System.out.println(result + "is the longest");
        /*
        another method

        if (first.contains("a") && first.length() >result.length) {
            result = second;
        }  if (second.contains("a") && second.length() >result.length) {
            result = first;
        }  if (third.contains("a") && third.length() >result.length) {
            result= third;
        }
         */
    }
}







