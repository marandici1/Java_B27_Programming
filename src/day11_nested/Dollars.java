package day11_nested;

public class Dollars {
    public static void main(String[] args) {

     // give 1 dollar and you get back change
     // change will be in quarters, nickles, dimes, pennies

        int money = 65; // where 100 is 1 dollar
       // System.out.println(97 / 25);
        int quarter = money / 25;
        // System.out.println(97 % 25);
        money %= 25; // money = money % 25;
        System.out.println(money);
        int dimes = money / 10;
        money %= 10;
        int nickles = money / 5;
        money%= 5;
        int pennies = money;

        System.out.println("Change:");
        System.out.println(quarter + " quartrers");
        System.out.println(dimes + " dimes");
        System.out.println(nickles + " nickles");
        System.out.println(pennies + " pennies");




    }
}
