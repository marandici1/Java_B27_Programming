package day30_methods;

public class T8_wrapperClassExample {
    public static void main(String[] args) {

        byte b = 9;
        Byte b2 = 23;
        Character c = 'j';
        System.out.println(c);

        int i = 4;
        Integer i2 = i; // primitive -> wrapper class : autoboxing
        System.out.println(i2);
        Integer i3 = 32;
        int i4 = i3; // wrapper class -> primitive: unboxing

        Integer i5 = new Integer(10);
        Integer i6 = 10;

    }
}
