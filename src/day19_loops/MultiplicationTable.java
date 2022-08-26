package day19_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int num =5;

        for (int i =0; i <=10; i++){
            System.out.println(num + " x " + i+ " = " + num * i);
        }
        for(int i =50; i >= 0; i--){
            System.out.print(i + " ");

        }
        System.out.println();
        for (char letter = 'A'; letter <= 'Z'; letter++){
            System.out.print(letter + " ");
        }
    }
}
