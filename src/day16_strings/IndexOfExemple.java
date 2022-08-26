package day16_strings;

import jdk.swing.interop.SwingInterOpUtils;

public class IndexOfExemple {
    public static void main(String[] args) {

        String s = "lollipop";
       //           01234567
        System.out.println("index of l: " + s.indexOf('l'));
        System.out.println("last index of l: " + s.lastIndexOf('l'));

        System.out.println("index of i: " + s.indexOf('i'));
        System.out.println("last index of i: " + s.lastIndexOf('i'));

        System.out.println("index of p: " + s.indexOf('p'));
        System.out.println("last index of p: " + s.lastIndexOf('p'));

        System.out.println("index of e: " + s.indexOf('e'));                 // -1 because is not existing
        System.out.println("index of P: " + s.toUpperCase().indexOf('P'));   // 5 because we use toUpperCase(
        System.out.println(s.lastIndexOf('I'));
        System.out.println();

        System.out.println("index of pop: " + s.indexOf("pop"));  // because start at index 5
        System.out.println("last index of Pop: " + s.indexOf("Pop"));

        System.out.println("index of lol: " + s.indexOf("lol"));

    }
}
