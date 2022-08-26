package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class createArray {
    public static void main(String[] args) {
        /* persons info
        0 -> id
        1-> first name
         */
        String[] student1 = {"04", "Kristina", "Gaidamovic", "27"};
        System.out.println(Arrays.toString(student1));
    //knowing the number of elements, but not the values
        String[] student2 =new String[4];
        student2[0] = "10";
        student2[1] = "Olena";
        student2[2] = "Kravetska";
        student2[3] = "27";
        System.out.println(Arrays.toString(student2));

        // know the number of elements, and add from Scanner
        Scanner input = new Scanner(System.in);
        String[] student3 = new String[4];
        System.out.println("Enter your id");
        student3[0] = input.next();
        System.out.println("Enter your first name");
        student3[1] = input.next();
        System.out.println("Enter your last name");
        student3[2] = input.next();
        System.out.println("Enter your batch number");
        student3[3] = input.next();
        System.out.println(Arrays.toString(student3));


        String[] student4 = new String[4];
        String[] questions = {"id", "first name", "last name", "batch number"};
        for (int i = 0; i < student4.length; i++) {
            System.out.println("Enter your " + questions[i]);
            student4[i] = input.next();

        }
    }
}
