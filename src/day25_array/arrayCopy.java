package day25_array;

import java.util.Arrays;

public class arrayCopy {
    public static void main(String[] args) {
        int[] nums ={1, 2, 3};
        int[] other = nums;
        System.out.println("Before");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));
        nums[0] = 10;

        System.out.println("After");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));
        other[2] = 25;
        System.out.println("After w/ other");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));
        int[] arr ={3, 4, 1, 5, 12, 5, -10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //copyOf

        int [] a = {5, 10, 15};
        int[] b = Arrays.copyOf(a, 3);  //new array
        System.out.println("before");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[1] = 100;
        System.out.println("after");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // we have two arrays, butwe only change the middle element of
    }
}
