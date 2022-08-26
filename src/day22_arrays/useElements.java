package day22_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class useElements {
    public static void main(String[] args) {

        int[] nums = {4,5,12};
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + nums[1]); //int + int

String []strs = {"Hello", "World", "Java", "code"};
        System.out.println(strs.length);
        System.out.println(strs[2]);
        System.out.println(strs[2] + strs[3]); // String + String Javacode
        System.out.println(strs[0].length()); //String method length() --> tell the number of character in the String

        System.out.println(strs[1].charAt(strs[1].length()-2));  //last index of the element at index 1

        String s = strs[3]; // assigning the value of the 3rd index of the array in to a new String variable s


    }
}
