package day21_tasks;
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                for (int k = i+2; k < str.length(); k++) {

                if (inp[i] == inp[k]){

                    break;}
                if (inp[i] == inp[j] ) {

                    System.out.print(inp[j]);

                    break;
                     }
                }
            }
        }
    }}
