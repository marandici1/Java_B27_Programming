package day34_custom_class.house;

public class T5_House {

    String type;
    double squareFeet;
    int numberOfBedroom;
    int numberOfBathroom;
    boolean inCity;
    boolean hasGarage;

public double calculateMortgage(){
    if(numberOfBathroom< 2){
        return 1500;
    }else if (numberOfBathroom<4){
        return 2000;
    }else{
        return 2500;
    }
}



  // Command + N to print override: + toString
    public String toString() {
        return "T5_House" +
                " type=" + type  +
               "\n" + ", squareFeet=" + squareFeet +
                "\n" +", numberOfBedroom=" + numberOfBedroom +
                "\n" +", numberOfBathroom=" + numberOfBathroom + "\n" +
                (inCity ? "In the City" : "In the suburbus") + "\n" + (hasGarage ? "Has garage" : "No garage. Street parking");
    }
}
