package day09_if_statements;

public class Lunch {
    public static void main(String[] args) {
        boolean isHungry = true;
        boolean isLunchTime = false;

        if(isLunchTime && isHungry){
            System.out.println("go eat lunch");
            System.out.println("take a break");
        } else {
            System.out.println("Practice more Java");
        }
    }

}
