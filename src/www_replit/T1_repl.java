package www_replit;

import java.util.Scanner;

public class T1_repl {
    public static void main(String[] args) {
        int [ ] array = new int [5];
        int [ ] items = {2, 7, 3, 5, 8, 9};
        int arr = items[0];
        for (int i = 0; i < items.length; i++)
            if (items[i] > arr)
                arr = items[i];
        System.out.println(arr);
    }
}