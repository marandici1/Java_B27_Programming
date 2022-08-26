package employee;

public class Company {
    public static void main(String[] args) {


        Developer newDev = new Developer("Jay", true, 5000, 6);
        System.out.println(newDev);
        System.out.println("fghjk");
        newDev.work();
        newDev.develop();

        Tester newTest = new Tester("Nika", false, 4765, true);
        System.out.println(newTest);
        newTest.work();
        newTest.test();
        System.out.println(newTest);
        employee123 newEmpl = new employee123("Zoya", true, 345676);
        System.out.println(newEmpl);
        newEmpl.work();

    }

}
