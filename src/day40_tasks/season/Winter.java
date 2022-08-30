package day40_tasks.season;

public class Winter extends Season{

    public Winter( double highestTemp, double lowestTemp) {
        super("Winter", highestTemp, lowestTemp);
    }

    @Override
    public void activity() {
        System.out.println("Use the Fireplace");
        System.out.println("Code Java");
    }

}
