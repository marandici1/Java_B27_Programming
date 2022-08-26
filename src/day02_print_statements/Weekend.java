package day02_print_statements;

public class Weekend {
    /*
    Create a main method
    create multiple print statements to describe things you will do this weekend
     */
    public static void main(String[] args) {
        System.out.println( "I will take care of kids");
        System.out.println("I will cook");
        System.out.println("I will clean the house");

        // above is multiple print statements

        System.out.println();  // empty print statement to have empty line in the console
        System.out.println("Shopping list");
        System.out.print(" apples, ");
        System.out.print(" meat, ");
        System.out.println("more milk");

        // instead of doing three lines like above, couldn't just do this:
        //System.out.println("apples, meat, more milk");
        // Yes, but we just wanted to see how print worked, in the future we would have better use of this, probably with loops.

    }


}
