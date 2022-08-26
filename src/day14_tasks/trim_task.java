package day14_tasks;

import java.util.Scanner;

public class trim_task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String info = input.nextLine();


        info = info.trim();
        System.out.println(info);
        info = info.toLowerCase();
        System.out.println(info);
        System.out.println(info.length());

        int lengh = info.indexOf("r");
        System.out.println(lengh);

    }
}
