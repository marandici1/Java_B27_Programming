package day12_switch_if;

public class switchDay {
    public static void main(String[] args) {
        int day = 9;

        switch(day){
            default: // acts like else, if allis falls this is coming up
                System.out.println("Not a valid number");
                break;
      case 1:
            System.out.println("Monday");
                break;
      case 2:
           System.out.println("Tuesday");
                break;
      case 3:
           System.out.println("Wednesday");
                break;
      case 4:
          System.out.println("Thursday");
                break;
      case 5:
          System.out.println("Friday");
                break;
      case 6:
          System.out.println("Saturday");
                break;
      case 7:
          System.out.println("Sunday");
                break;
        }
    }
}
