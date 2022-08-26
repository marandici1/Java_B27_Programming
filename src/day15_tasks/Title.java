package day15_tasks;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name and your Title: ");
        String name = input.nextLine();

        boolean mister = name.toLowerCase().startsWith("mr" ) || name.toLowerCase().startsWith("mister") || name.toLowerCase().endsWith("mr" ) || name.toLowerCase().endsWith("mister");

        boolean miss = name.toLowerCase().startsWith("ms" ) || name.toLowerCase().startsWith("miss") || name.toLowerCase().endsWith("ms" ) || name.toLowerCase().endsWith("miss") ;

        boolean drStart = name.toLowerCase().startsWith("dr" ) || name.toLowerCase().endsWith("dr" ) ;
        boolean srEnd = name.toLowerCase().startsWith("sr" ) || name.toLowerCase().endsWith("sr" );
        boolean jrEnd = name.toLowerCase().startsWith("jr" ) || name.toLowerCase().endsWith("jr" );

        if(mister  ){
             System.out.println( "Hello Sir");
        }
        if (miss) {
            System.out.println("Hello Ma'am");
        }
         if (drStart){
            System.out.println("Hello Doctor");
        }
        if (srEnd){
            System.out.println("Nice to meet you Senior");
        }
        if (jrEnd){
            System.out.println("Nice to meet you Junior");
        }
        /* different method
        name = name.toLowerCase();
        if(name.startsWith("mr" ) || name.startsWith("mister") ){
        System.out.println( "Hello Sir");
        }else if(name.startsWith("ms" ) || name.startsWith("miss") ){
        System.out.println( "Hello Ma'am");
         }else if(name.startsWith("dr" )){
        System.out.println( "Hello Doctor");
         }
          if(name.endsWith("sr" )){
        System.out.println( "Nice to meet you Senior");
        else if(name.endsWith("jr" )){
        System.out.println( "Nice to meet you Junior");
         */
float f = 19.99f;
    }
}
