package day29_classMethods;

public class T3_FrequencyOfCharacter {
    public static int frequencyOfChar(String str, char letter){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == letter){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(frequencyOfChar("java", 'a'));
        System.out.println(frequencyOfChar("apple", 'a'));
        System.out.println(frequencyOfChar("apple", 'p'));
        System.out.println(frequencyOfChar("mississippi", 'i'));
        System.out.println(frequencyOfChar("mississippi", 's'));
    }
}
