package day09_tasks;

public class CharLetter {
    /*create a char variable letter. Find and print if the character is a letter, number, or special character

    ex:     p
            letter
    ex:
            6
          number
    ex:
             $
          speical character

     */
    public static void main(String[] args) {
        char letter = 'b';
        if(letter >= 'a' && letter <= 'z'){
            System.out.println(letter + "\nletter");
        }
        if(letter >= '0' && letter <='9'){
            System.out.println(letter + "\nnumber");
        }
        if(letter == 33){
            System.out.println(letter + "\nspecial character");
        }

    }
}
