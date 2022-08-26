package day20_for_loops;

import java.util.Scanner;

public class BiggestSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str = input.nextLine();
        String longest ="";
        String each ="";
        for(int i =0; i <str.length()-1; i++) {

            each += str.charAt(i);  //adds the characters at index i so the String each

            // checks for the end of the String
            if(i == str.length()-2 && str.charAt(i) == str.charAt(i+1)){
                each+= str.charAt(i+ 1);
                if(each.length()>longest.length()){
                    longest=each;
                }
            }
            if(str.charAt(i) != str.charAt(i+1)) { //if the current character is not equal to the next character

                if (each.length()> longest.length()){
                    longest=each; // if you find a longer substring, assign it to the longest variable
                }
                each = "";  //resetting for the next part
            }

        }
        System.out.println(longest);
    }
}
