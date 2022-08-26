package employee;

public class employee123 {
    /*Create a Employee class

	- create variables:
		name, is full time, salary

	- create method:
		work()
			Example output: prints $name is working
			*/

String name;
boolean isFullTime;
double salary;

public void work(){
    System.out.println("Prints " + name + " is working");

}

    public employee123(String name, boolean isFullTime, double salary) {
        this.name = name;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee123{" +
                "name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
