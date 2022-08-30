package day40_tasks.season;

public class CheckSeason {

    public static void main(String[] args) {
        Winter winter1 = new Winter(75.5, 30.4);
        System.out.println(winter1);
        winter1.activity();

        Summer summer1 =new Summer(107.8, 75.3);
        System.out.println(summer1);
        summer1.activity();
    }


}
