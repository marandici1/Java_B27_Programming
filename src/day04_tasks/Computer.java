package day04_tasks;

public class Computer {
    /* create a class Computer
create a main method

    declare and assign these variables with the most appropriate datatypes:

        brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth

        create a summary of the information and print it. Be creative
     */
    public static void main(String[] args) {
        System.out.println("My computer settings: ");
        String brand = "Apple";
        String processor = " 10th generation Intel core i3";
        int ramMemory = 8;
        int storageMemory = 256;
        boolean hasMonitor = true;
        boolean hasWifiCord = false;
        double price = 1299.99;
        int numberOfUsb = 0;
        boolean hasBluetooth = true;

        System.out.println("brand = " + brand);
        System.out.println("processor = " + processor);
        System.out.println("ramMemory = " + ramMemory + "gb");
        System.out.println("storageMemory = " + storageMemory + "gb");
        System.out.println("hasMonitor = " + hasMonitor);
        System.out.println("hasWifiCord = " + hasWifiCord);
        System.out.println("price = " + price + "$");
        System.out.println("numberOfUsb = " + numberOfUsb);
        System.out.println("hasBluetooth = " + hasBluetooth);
    }
}
