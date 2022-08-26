package day19_tasks;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple word");
        String str = input.nextLine().toLowerCase();
        String camelCase = "";

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                camelCase+=str.substring(i+1, i+2).toUpperCase();  //gives the one character after the space
               //("" + str.charAt(i+1)).toUpperCase();
                i++;// if you don't add the i++ it will add uppercase 1 + lower 1

        }else{
                camelCase += str.charAt(i);
            }
    }
        System.out.println(camelCase);
}}
