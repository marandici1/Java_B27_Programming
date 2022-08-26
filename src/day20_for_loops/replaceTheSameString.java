package day20_for_loops;

public class replaceTheSameString {
    public static void main(String[] args) {
        String s= "sdfghjkhisdfghisdcvhi";
        int count=0;

        while(s.contains("hi")){
            System.out.println(s);
            count++;
            s= s.replaceFirst("hi", "");//replace the first occurrence

        }
        System.out.println(count);
        System.out.println(s);
    }
}
