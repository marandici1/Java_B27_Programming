package day34_tasks.car;

public class car {
    String model;
    int year;
    String color;
    double fuelLevel;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

    public void drive() {
        System.out.println("driving " + model);
        fuelLevel -= 5;

    }

    public void fillTank() {
        System.out.println("filling tank");
        fuelLevel = 100;
    }

    public boolean isLow() {
        if (fuelLevel < 25) {
            return true;
        } else {
           return false;

        }

    }
}
