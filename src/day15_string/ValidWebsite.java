package day15_string;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your website: ");
        String web = input.nextLine();
       /* System.out.println(web.startsWith("www."));
        System.out.println(web.endsWith( ".com" ));
        System.out.println(web.endsWith( ".edu" ));
        System.out.println(web.endsWith( ".gov" ));
        System.out.println(web.endsWith( ".net" ));
        */
        boolean validStart = web.startsWith("www.");
        boolean validEnd = web.endsWith(".com") || web.endsWith( ".edu" ) || web.endsWith( ".gov" ) || web.endsWith( ".net" );

        if(validStart && validEnd) {
            System.out.println(web + " is valid");
        }else{
            System.out.println(web + " is invalid");
        }
        if(!validStart){
            System.out.println("Website sould start with www.");
        }
        if(!validEnd){
            System.out.println("Website should end with: .com or .edu or .gov or .net");
        }
        System.out.println("--------");
        System.out.println(validStart && validEnd ? "Valid website" : "Invalid website");

    }
}
