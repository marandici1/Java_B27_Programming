package day06_operators;

public class UpdatingVariables {
    public static void main(String[] args) {

        int n = 10;

        // reassign a new value
        n = 20;

        int a = 3;
        a = a + 4;  //3+4 = 7 became new value

        int b = 15;
        b += 9; // b=b+9;
        b += 1; // b = b+1

        int z = 10;
        z++;
        System.out.println(z);

        /*
        updating a number by 1:
        z= 11;
        or
        z=z+1:
        or
        z +=1
        or
        z++;
         or
        ++z;
         */




        int java = 8;
        int testing = --java; // pre decrement
        System.out.println(java); // 8 ---> 7
        System.out.println(testing); // 7
        System.out.println();


        int x = 7;
        int y = x--; // post decrement

        System.out.println(x);  // x=(7-1)
        System.out.println(y);  // y = x(7)
        System.out.println(y);

    }
}
