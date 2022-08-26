package day34_tasks.car;


    public class carObject {
        public static void main(String[] args) {
            car carObject = new car();


            carObject.model= "Lexus";
            carObject.year = 2021;
            carObject.color = "White";
            carObject.fuelLevel= 34.56;


            System.out.println(carObject);

            carObject.drive();
            System.out.println(carObject);

            carObject.fillTank();
            System.out.println(carObject);

            carObject.isLow();
            System.out.println(carObject);
        }
}

