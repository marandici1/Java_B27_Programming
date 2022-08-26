package employee;

public class Developer extends employee123{
    /*
    Create a class Developer

	- Developer class inherits Employee class

	- create additional variables:
		features created

	- create method:
		develop()
			Example output: prints Creating more features
     */

    int featuresCreated;
    public Developer(String name, boolean isFullTime, double salary, int featuresCreated) {
        super(name, isFullTime, salary);
        this.featuresCreated = featuresCreated;
    }
    public void develop(){
        System.out.println("Creating more features");
    }
}
