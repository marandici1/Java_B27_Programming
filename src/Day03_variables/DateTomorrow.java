package Day03_variables;

public class DateTomorrow {
    public static void main(String[] args) {

        /*
        declare and assign 3 variables(numbers)
            month, day, year

            print the date in this format:
                Date: month \ day \ year

            also update the day for tomorrow date
            print tomorrow's date in this format:
               Tomorrow's Date: month \ day \ year
            */
        int month = 10, day = 7, year = 2010;
        // alternative declaration and assignment:
        // int month = 10;
        // int day = 7;
        // int year = 2010;
        System.out.println("Date: " + month + " \\ "+ day + " \\ " + year);
        System.out.println();
         day = 8;
        System.out.println("Tomorrow's Date: " + month + "\\"+ day + "\\" + year);
        

    }
}
