package day06_operators;

public class relationalTask {
    public static void main(String[] args) {
        int speed = 65;
        boolean InSpeedLimit = speed <= 50;
        System.out.println("InSpeedLimit = " + InSpeedLimit);


        //another option:
        int speed1 = 65;
        int speedlimit = 50;
        boolean isSpeeding = speed > speedlimit;
        System.out.println("is speeding: " + isSpeeding);

        int number = -5;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);

        System.out.println(true == true);

        System.out.println('a' == 'A');

        /* define aa number
        find out if it is even or odd
         */

        int num1 = 20;
        boolean isEven = num1 % 2 == 0;
        boolean isOdd= num1 % 2 != 0; // num % 2 == 1 // isEven != true

        System.out.println("isEven = " + isEven);
        System.out.println("isOdd = " + isOdd);






    }


}
