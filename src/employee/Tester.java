package employee;

public class Tester extends employee123{
    /*
    Create a class Tester

	- Tester class inherits Employee class

	- create additional variables:
		bugs found

	- create method:
		test()
			Example output: prints Running the regression
     */
    boolean bugsFound;

    public Tester(String name, boolean isFullTime, double salary, boolean bugsFound){
        super(name, isFullTime, salary);
        this.bugsFound=bugsFound;
    }


    public void test(){
        System.out.println("Running the regression");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "bugsFound=" + bugsFound +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }

}
