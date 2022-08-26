package day34_tasks.rectangle;

public class rectangleWorking {
    public static void main(String[] args) {


        rectangle rec1 = new rectangle();


        rec1.base= 10.0;
        rec1.height = 20.0;
        rec1.x = 5;
        rec1.y= 12;

        System.out.println(rec1);

        rec1.calculatePerimeter();
        rec1.calculateArea();
        System.out.println(rec1);



    }
}
