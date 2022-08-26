package day35_custum_classes.traffic;

public class TrafficLight {
    String color;

    public TrafficLight(String inputColor) {

        boolean isValid = inputColor.equalsIgnoreCase("red") || inputColor.equalsIgnoreCase("yellow") || inputColor.equalsIgnoreCase("green");
        if(isValid){
            color = inputColor;
        }
    }
}
