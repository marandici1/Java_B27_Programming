package day41_exceptions;

public class Runner {
    public static void main(String[] args) {

        Sport obj = new Sport();
        obj.setName("James");
        obj.setAge(21);
        System.out.println(obj);

        Sport obj2 = new Sport();
        obj2.setName("Alla");
        obj2.setAge(-21);
        System.out.println(obj2);
    }
}
