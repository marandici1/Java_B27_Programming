package day06_operators;

public class CharIncrement {
    public static void main(String[] args) {

        char letter = 'A';
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter);
        System.out.println();
        char letter2 = 'a';
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);

        char digits = '9'; // this is a character 9, the digits, not the number 9
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits); // this is printing character
        System.out.println((int)digits); //cast the character to an int, which mean that is ascii number for that character

        System.out.println(65);
        System.out.println((char)65); // casting int 65 to char, it will print the character A
    }
}
