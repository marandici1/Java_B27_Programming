package day22_tasks;

public class reverseArray {
    public static void main(String[] args) {

            String[] num = {"1", "3", "5", "7", "9"};

            System.out.print(num[4] + ", ");
            System.out.print(num[3]+ ", ");
            System.out.print(num[2]+ ", ");
            System.out.print(num[1]+ ", ");
            System.out.print(num[0]);

        System.out.println();
        for (int i = num.length-1; i >= 0; i--) {
            System.out.println(num[i]);

        }

        // create our own format:
        String arrayAsString = "Array ~ ";
        for (int i = 0; i < num.length; i++) {
            arrayAsString+= num[i] + "|";
        }
        arrayAsString += "~ END";
        System.out.println(arrayAsString);
    }
}
