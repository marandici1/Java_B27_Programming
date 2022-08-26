package day38_encapsulation.rectangle;

public class useRectangle {
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle();
      //  rectangle1.length = 10;
     //   rectangle1.length = 6;
        rectangle1.setLength(10);
        rectangle1.setWidth(5);

        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
    }
}
