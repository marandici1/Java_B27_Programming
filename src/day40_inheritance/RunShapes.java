package day40_inheritance;

public class RunShapes {

    public static void main(String[] args) {

        circle circle = new circle(3.4);
        System.out.println(circle);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        System.out.println();
        square square = new square(5.5);
        System.out.println(square);
    }
}
