package day05_arithmetic_operations;

import org.w3c.dom.ls.LSOutput;

public class TypeCasting {
    public static void main(String[] args) {


        byte b = 14;
        int i = b; //int is bigger, so this is okay

        long l = 40l; // by default 40 is int type, int can automatically be stored into a long because int is smaller than long
        long l2 = 2000000000L;  // is int by default, but it is too long for int type, so we need to tell the compiler it is a long type with L
        float f = 10;
        System.out.println(f);
        double d = 19.99;
        int i2 =(int)d; // double is bigger than int, so I will need to cast to int
        System.out.println(i2);

        int i3 =500;
        byte b2 = (byte)i3;
        System.out.println(b2);

        short s = 60;
        double d3 = s; //automaticly convert

        float f2 = (float)100.50; // or we can do 100.50F;
        long l3 = (long)f2;
        System.out.println(l3);

        double d4 = l3;
        System.out.println(d4);



    }
}
