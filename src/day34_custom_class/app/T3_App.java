package day34_custom_class.app;

public class T3_App {
    String name;
    double version;
    boolean isFree;
    int ratings;

    public void update(){
        System.out.println(name + " is updating");
        version += 0.1;
    }

    public String toString(){
        return "Name: " + name + "\nVersion: " + version +"\n is Free: " + isFree + "\nRatings: " + ratings;
    }
}
