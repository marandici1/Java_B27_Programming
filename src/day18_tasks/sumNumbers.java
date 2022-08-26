package day18_tasks;

public class sumNumbers {
    public static void main(String[] args) {
        //write a program that will add all the numbers from 1 - 500
        int num = 0;
        int sum = 0;
        while(num <= 500){
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
