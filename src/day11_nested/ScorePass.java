package day11_nested;

public class ScorePass {
    public static void main(String[] args) {
        int score =90;

        if ( score>= 75 ) {
            System.out.println("Passed");
         if ( score >92 ){
            System.out.println("You did really well");
        } else if(score > 80) {
             System.out.println("Good job");
         }
        }else {
             System.out.println("Failed");
             if(score > 50){
                 System.out.println("try harder");
             }else {
                 System.out.println("Study much more");
             }
         }
    }
}
