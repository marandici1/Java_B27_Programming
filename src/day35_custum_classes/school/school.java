package day35_custum_classes.school;

public class school {
   String name;
   int totalNumOfStudents;
   double avgGpa;

// this keyword allows us to access the instance variables, not the local variable

    public school(String name, int totalNumOfStudents, double avgGpa){
       this.name = name;
       this.totalNumOfStudents = totalNumOfStudents;
       this.avgGpa = avgGpa;

   }


    @Override
    public String toString() {
        return "school{" +
                "name='" + name + '\'' +
                ", totalNumOfStudents=" + totalNumOfStudents +
                ", avgGpa=" + avgGpa +
                '}';
    }
}
