package day11_nested;

public class ArmyQualification {
    public static void main(String[] args) {
        int age = 30;
        boolean diploma = true;
        boolean citizen = true;

        if((age >= 18 && age <= 35) && diploma && citizen){
            System.out.println("You Qualify for the Army");
        }else{
            if(age <0 || age > 120) {
                System.out.println("Not a valid age number");
            } else if(age < 18) {
                System.out.println("You are too young");

            } else if( age > 35){
                System.out.println("You are too old");
            }

            if(!diploma){
                System.out.println("You need at least a High School diploma");
            }
            if(!citizen){
                System.out.println("You need to be a citizen to apply");
            }
        }
    }
}
