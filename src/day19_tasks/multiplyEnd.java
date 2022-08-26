package day19_tasks;

public class multiplyEnd {
    public static void main(String[] args) {


    String str = "hello";
    int end = 3;
    for(int i = 0; i< end; i++) {//int i =1; i <=end
        str += str.charAt(str.length()-1);
    }
        System.out.println(str);
    }
}
