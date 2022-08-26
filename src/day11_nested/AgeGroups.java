package day11_nested;



public class AgeGroups {
    public static void main(String[] args) {
        /*
        age 0 - 120
        <1 baby
         */

        int age = 150;
        if (age >= 0 && age <= 120) { //precondition to check for valid age

            if (age <= 1) {
                System.out.println("Baby");
            } else if (age <= 5) {
                System.out.println("Toddler");
            } else if (age <= 13) {
                System.out.println("kid");
            } else if (age <= 18) {
                System.out.println("Teenager");
            } else if (age <= 40) {
                System.out.println("Adult");
            } else if (age <= 65) {
                System.out.println("Senior");
            } else { // here the age will be 66 - 120
                System.out.println("Senior");
            }

        }else {
            if(age <0){
                System.out.println("Ages cannot be zero");
            }else {
                System.out.println("Ages cannot be more than 120");
            }
        }
    }
}