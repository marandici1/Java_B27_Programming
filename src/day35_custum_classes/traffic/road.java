package day35_custum_classes.traffic;

public class road {
    public static void main(String[] args) {


        TrafficLight light = new TrafficLight("red");
       // light.color = "red";
        System.out.println(light.color);

        // invalid case :
        TrafficLight light2 = new TrafficLight("blue");
        System.out.println(light2.color);
    }
}
