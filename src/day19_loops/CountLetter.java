package day19_loops;

public class CountLetter {
    public static void main(String[] args) {
        //frequency
        // word -> java
        //how many 'a' chars?
        String word = "java";
        int counter = 0;
        for(int i = 0; i< word.length(); i++){  // i <= word.length() -1
          if(word.charAt(i) == 'a'){
              counter++;
          }
        }
        System.out.println(counter);
    }
}
