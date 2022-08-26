package day34_custom_class.house;

public class T6_Market {
    public static void main(String[] args) {
        T5_House house1 = new T5_House();


        house1.type= "Townhouse";
        house1.squareFeet = 1300;
        house1.numberOfBedroom = 3;
        house1.numberOfBathroom = 2;
        house1.inCity = false;
        house1.hasGarage = true;

        System.out.println(house1);
        System.out.println("------");
        System.out.println( house1.calculateMortgage());

    }
}
