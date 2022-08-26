package day10_tasks;

import jdk.swing.interop.SwingInterOpUtils;

public class Loan {
    /*
    create a class Loan
declare and assign a credit score variable
try to use ternary to determine of you are eligible for a loan
you are eligible if you have a credit score of 700 or above
if you are eligible print "loan approved"
otherwise print "loan rejected. Sign up for our credit program"
     */
    public static void main(String[] args) {
        System.out.println("Your credit score: ");
        int creditScore = 750;
        System.out.println(creditScore);
        System.out.println(creditScore> 700 ? "Loan apprved" : "Loan rejected. Sign up for our credit program" );
    }
}
