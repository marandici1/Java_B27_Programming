package day06_operators;

public class logicalExamples {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isGoodTemp = true;
        boolean doBbq = isWeekend && isGoodTemp;
        /*
        this is not necessary
        isWeekend == true && isGoodTemp == true;

         */
        System.out.println("doBbq = " + doBbq);
        // both boolean have to be true to work
        boolean isWeekend2 = true;
        boolean isGoodTemp2 = false;
        boolean doBbq2 = isWeekend2 && isGoodTemp2;
        System.out.println("doBbq2 = " + doBbq2);

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFirefighter = false;

        boolean getDiscount = isTeacher || isPolice || isFirefighter; // || OR ONLY ONE OF THE BOOLEAN NEED TO BE TRUE, FOR THE RESULT TO BE TRUE

        System.out.println("getDiscount = " + getDiscount);

        // goal 5 < number < 10
        int number = 8;
        System.out.println(number > 5 && number <10); //true && true --> true
        System.out.println(number > 0 && number <5); // true && false --> false

        int age = 40;
        boolean inValidAge = age < 0 || age > 120; // false || false --> false

    }



}
