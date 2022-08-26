package day38_encapsulation.traffic;

public class trafficLight {

    private String color;
    public trafficLight(String color){
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("green") || color.equals("yellow") || color.equals("red")) {
            this.color = color;
        }
    }
}
