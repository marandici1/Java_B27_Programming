package day16_tasks;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String word1 = input.nextLine();
        System.out.println("Enter the second word: ");
        String word2 = input.nextLine();

        word1 =word1.substring(1);
        word2= word2.substring(0, word2.length()-1);
        System.out.println(word1);
        System.out.println(word2);
    }
}
