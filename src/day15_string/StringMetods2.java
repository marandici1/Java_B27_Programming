package day15_string;

public class StringMetods2 {
    public static void main(String[] args) {
        String str = "today it is 80 degrees";
        System.out.println(str);
        System.out.println("str.contains(today) " +str.contains("today"));
        System.out.println("str.contains(it is) " +str.contains("it is"));
        System.out.println("str.contains(degrees) exact sequences " +str.contains("deg"));
        System.out.println(str.contains("80") && str.contains("today"));



    }
}
