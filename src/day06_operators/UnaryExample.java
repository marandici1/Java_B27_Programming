package day06_operators;

public class UnaryExample {
    public static void main(String[] args) {



    int n = 0; // 0
    n++;       // post increments. value becomes 1
        System.out.println(n);
        ++n; // pre increment, value becomes 2
        System.out.println(n);

        System.out.println(++n); //value become 3

        System.out.println(++n);
        System.out.println(n);
        System.out.println("post number: ");
        System.out.println(n++);
        System.out.println(n);

        System.out.println("-------------------------");

        int x = 4;
        int y = x;
        int z = ++x;  // pre increment
        System.out.println("x " + x); //4 ---> 5
        System.out.println("y " + y); //4

        System.out.println("z " + z); //5
        int v = ++z;
        System.out.println("v " + v); //6


        System.out.println("------------------------");



        int candy = 5;
        System.out.println("Your kid ask for candy, you have " + candy);
        System.out.println("You give them, so now you have " + --candy); // decrement, subtract 1 first, then print
        System.out.println("The sibling comes in and they want one, you check how many there is, then give them one " + candy-- ); // post decrement
        System.out.println("Total candy in jar now " + candy);


        // use case: counting:
        // your name, we want find  how many times your name as the letter 'a'
        int counter = 0;
        counter++;
        // we find another a
        counter++;

        System.out.println("1\n 2\n 3 \n");
}
}
