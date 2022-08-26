package day26_multiDimensional;

import java.sql.SQLOutput;
import java.util.Arrays;

public class groups {
    public static void main(String[] args) {

        String[][] cydeo = {
                {"Alen", "Tina", "Alena", "Nargiza"},
                {"Anam", "Baz", "Busra", "Ostap"},
                {"Rabia", "Shahad",},
                {"Ketino", "Eylul", "Nadia"}
        };
        System.out.println(Arrays.deepToString(cydeo)); // prints the whole 20 array
        System.out.println(cydeo.length);  // how many inner, 1st array is there -> how many elements in the 2nd array
        System.out.println(cydeo[2].length); // how many elements in the array at index 2
        System.out.println(cydeo[0][3]); //  accessing one specific String element from the inner array at index 0 and giving back the element at index 3
        System.out.println(Arrays.toString(cydeo[1])); // printing the whole inner element array at index 1
        //how to loop through each inner array

        for (String[] eachInner : cydeo) {
            System.out.println(Arrays.toString((eachInner)));
        }
        System.out.println();

        // how to loop through each name

        for (String[] eachInner : cydeo) {
            for (String eachName : eachInner) {
                System.out.println(eachName);
            }
        }
        for (String[] eachInner : cydeo) {
            for (String eachName : eachInner) {
                System.out.println(eachName.substring(eachName.length() - 1).toUpperCase());
            }}
}}
