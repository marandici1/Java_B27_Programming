package day16_strings;

public class Email {
    public static void main(String[] args) {
        String s = "saim@cydeo.com";
        System.out.println("name " + s.substring(0,4));
        System.out.println("domain " + s.substring(5,10));

// second option
        int indexOfAt = s.indexOf('@');
        String name = s.substring(0, indexOfAt);
        int indexOfDot = s.indexOf('.');
        String domain = s.substring(indexOfAt + 1, indexOfDot);
        System.out.println("Full email: " + s);
        System.out.println("Name: " + name);
        System.out.println("Domain: " + domain);

    }
}
