package day18_while;

public class doWhileEx {
    public static void main(String[] args) {

        int i = 6;

        do {
            System.out.println(i);
        } while (false);
        // the do block is execute first, then the boolean is checked

        System.out.println();

        do{
            System.out.println(i);
            i++;
        }while (i <= 10);


    }
}
