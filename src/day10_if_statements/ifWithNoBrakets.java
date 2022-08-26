package day10_if_statements;

public class ifWithNoBrakets {
    public static void main(String[] args) {

        if(3 < 9){
            System.out.println("First");
            System.out.println("Second");
        }
        if(3 > 9 )
            System.out.println("Third");
            System.out.println("Fourth"); // this is not a part of if statement


        System.out.println("------------------------");

        if(5% 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");

        System.out.println("--------------");
        char a = 'c';

        if( a == 'a')
            System.out.println("letter a");
        else if(a == 'b')
            System.out.println("letter b");
        else if (a == 'c')
            System.out.println("letter c");
        else
            System.out.println("other");
    }
}
