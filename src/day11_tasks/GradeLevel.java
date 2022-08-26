package day11_tasks;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        Create a class called GradeLevel, Given a number grade level determine and print which school type someone is in.
grade level and types are:
    any number less than 1 or more than 18 is not valid
    1-5: Elementary school
    6-8: Middle school
    9-12: High school
    13-16: College
    17-18: Grad School
         */
        int grade = 8;
        if(grade <1 || grade>18){
            System.out.println("Is not valid ");
        }else if (grade>=1 && grade <= 5){
            System.out.println("Elementary school");
        }else if( grade>=6 && grade <= 8){
            System.out.println("Middle school");
        }else if( grade >=9 && grade <= 12){
            System.out.println("High school");
        }else if(grade >=13 && grade <= 16){
            System.out.println("College");
        }else{
            System.out.println("Grad School");
        }

    }
}
