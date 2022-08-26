package day10_if_statements;

public class BiggestNumber {
    public static void main(String[] args) {
    int first = 7;
    int second = 2;
    int third = 3;
    int biggest = 0;
    if(first > second && first > third){
       biggest = first;
    } else if(second > first && second> third){
        biggest = second;
    } else {
        biggest = third;
    }
        System.out.println(biggest + " is the biggest");
    }
}
