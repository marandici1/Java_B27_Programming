package day19_tasks;

public class ReverseWord {
    public static void main(String[] args) {
       String str = "I love you";
        int start = str.indexOf(' ')+1; //gove me the middle word of first character
        int end = str.lastIndexOf(' ');
        String middleWord = str.substring(start, end);

        String reverseMiddle = "";
        for (int i = middleWord.length()-1; i >=0; i--){//loop start fron the last index of the middle word and goes until first index in a backward order
            reverseMiddle +=middleWord.charAt(i);//reading each character based n the int i value, which is going backwards and then concatenating that character  to the reverseMiddle String
            System.out.println(str.substring(0, str.indexOf(' ')) + " " + reverseMiddle + " " + str.substring(end + 1));

        //str.substring(0, str.indexOf(' ') gives the first word
        // str.substring(0, str.indexOf(' ') could have been written as: str.substring(0, start - 1)

        // str.substring(end + 1) could have been written as: str.substring(str.lastIndexOf(' ') + 1)


        //str.replace(middleWord, reverseWord) another option instead of line 26


        }
        /* alternative revers:
        String str = "I love you";
        String reverse ="";
        for (int i = str.lastIndexOf(' ')-1; i >str.indexOf(' '); i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        */
    }
}
