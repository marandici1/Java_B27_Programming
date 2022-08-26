package day37_static_methods.school;

public class District {

    public static void main(String[] args) {
        school.district = 149;
        school.totalTeachers = 100;
        school.totalStudents = 3000;

        school.totalTeachers--;

        System.out.println(school.district);
        System.out.println(school.totalTeachers);
        System.out.println(school.totalStudents);

        school.announcement();
       // school.lunch(); // lunch() method is instance
        school middle = new school();
        middle.lunchTime = 12;
        //school.lunchTime;
        middle.lunch();

        middle.totalStudents = 5000;
        System.out.println(school.totalStudents);
    }
}
