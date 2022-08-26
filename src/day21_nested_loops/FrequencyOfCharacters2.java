package day21_nested_loops;

public class FrequencyOfCharacters2 {
    public static void main(String[] args) {
        String str = "java";
        String checked = "";
        for(int i =0; i<str.length(); i++){ //outer: iterating one character at a time --> charAt(i)
            int count=0;  // the counter should reset back to 0 for every character
            if(!checked.contains("" + str.charAt(i))){  //only run the counting and inner loop if the character has not already been checked

            for(int j = 0; j< str.length(); j++){  // inner: compare the character we are looking at(i) with each other character in the String --> str.charAt(j)
                if(str.charAt(i)== str.charAt(j)){
                    count++;
                }
            }  //inner loop ends
            System.out.println(str.charAt(i) + " - " + count);
            checked += str.charAt(i); //add to the check String
        }  //if statement ends
    }  //outer loop ends
    }
}
