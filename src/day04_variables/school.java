package day04_variables;

public class school {
    /* Add a new class School
add main method

declare and assign all these variables:
    (all int) grade1, grade2, grade3, grade4, grade5

    assign the number of students in each grade

    extra: try to create another variable to find the total number of students in the whole school

    (all double) average gpa, number of school days, number of snow days
     */

    public static void main(String[] args) {
        int grade1 = 20, grade2 = 25, grade3 =23, grade4 = 38, grade5 = 30;
        int total = grade1 + grade2 + grade3 + grade4 + grade5;
        double averageGpa = 3.8, numberOfSchoolDays = 110.5, numberOfSnowDays = 3.5;
        System.out.println(total);
        System.out.println(averageGpa);
        System.out.println(numberOfSchoolDays);
        System.out.println(numberOfSnowDays);
    }
}
