package day14_tasks;

public class practice {
    public static void main(String[] args) {
        String password = "Brooklyn";
        int pass =password.length();
        System.out.println(pass);
        if(password.equals("Brooklyn")){
        System.out.println("Valid password by length");}
        else{
            System.out.println("Invalid password by length");
        }
        if (pass>= 8){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid password");
        }

    }
}
