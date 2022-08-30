package day40_tasks.season;

public class Season {

    String name;
    double highestTemp;
    double lowestTemp;

    public Season(String name, double highestTemp, double lowestTemp) {
        this.name = name;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;

    }

    public void activity(){
        System.out.println("generic season");
    }



    @Override
    public String toString() {
        return name + " season with the highest temperature of " +highestTemp + " and a lowest temperature " + lowestTemp;
    }


}
