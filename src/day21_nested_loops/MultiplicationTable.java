package day21_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1; i <=10; i++){  // outer loop
            System.out.println("Table for " + i);
            for (int j= 1; j<=10; j++){  // inner loop
                System.out.print( i + " x " + j + " = " + i*j + " ");
            }
            System.out.println();
        }
    }
}
