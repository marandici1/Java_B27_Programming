package day19_tasks;

public class addSpace {
    public static void main(String[] args) {


                String a = "hello world";
                String result = "";

                for(int i = 0; i < a.length(); i++) { // i <= a.length() -1
                    char letter = a.charAt(i);

                    if (letter == ' '){
                        result += "_ ";
                    }else {
                        result += letter + " ";
                    }

                }
                System.out.println(result.trim());

    }
}
