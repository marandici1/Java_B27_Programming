package day10_tasks;

import java.util.Scanner;

public class ChooseLanguage {
    /*
    create a class ChooseLanguage
ask the user to enter a number based on the language they wanted to use.
	1 - English
	2 - Spanish
	3 - Turkish
	4 - Russian
	5 - French
based on the number they picked print a message:
	1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
   Extra: add your own options
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre the number based on the language: \n1 - English\n2 - Spanish\n3 - Turkish\n4 - Russian\n5 - French\n");
        int number = input.nextInt();
        if (number == 1){
            System.out.println("2 : \"hello, thank for your call\"");
        }else if(number ==2){
            System.out.println("2 : \"hola, gracias para llamar\"");
        }else if (number ==3){
            System.out.println("3 : \"merhaba, aradiginiz icin tesekkurler\"");
        }else if (number ==4){
            System.out.println("4 : \"privet, spasibo za vash zvonok\"");
        }else if (number ==5){
            System.out.println("5 : \"Merci ,pour votre appel\"");
        }else{
            System.out.println("1 : \"hello, thank for your call\"");
        }
    }
}
