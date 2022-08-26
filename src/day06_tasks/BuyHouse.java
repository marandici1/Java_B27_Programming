package day06_tasks;

public class BuyHouse {
    public static void main(String[] args) {
        /* create a class BuyHouse

    declare and assign a credit score variable
    declare and assign a salary

    determine if you can get a loan to buy a house
    there is two ways to get a loan:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above
         */
    int creditScore = 743;
    double salary = 97893.87;

        boolean option1 = creditScore >= 720  && salary >= 100000;
        boolean option2 = creditScore >= 740  && salary >= 80000;

        boolean getLoan = option1 || option2;
        System.out.println("getLoan = " + getLoan);

        /*
        boolean option1 = creditScore >= 720 && salary >= 100000;
        boolean option2 = creditScore >= 740 && salary >= 80000;

        boolean canGetLoan = option1 || option2;
        System.out.println (canGetLoan);
         */

    }
}
