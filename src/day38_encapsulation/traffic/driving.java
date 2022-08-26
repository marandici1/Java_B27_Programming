package day38_encapsulation.traffic;

public class driving {
    public static void main(String[] args) {
        trafficLight road = new trafficLight("red");
        System.out.println(road.getColor());  //road.color is not valid
        road.setColor("blue");
        System.out.println(road.getColor());  //it will not reasign blue because is not a valid color
        road.setColor("green");
        System.out.println(road.getColor());
    }
}
