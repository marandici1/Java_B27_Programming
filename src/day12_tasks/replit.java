package day12_tasks;

import java.util.Scanner;

public class replit {
        public static void main(String[] args) {

                    Scanner input = new Scanner(System.in);
                    Double totalPrice = 0.0;
                    int screenPrice = 0;
                    int cPUPrice = 0;
                    int rAMPrice = 0;
                    int storagePrice = 0;
                    int resolutionPrice = 0;

                    System.out.println("Select screen size:");
            String screenSize = input.nextLine();
                    switch(screenSize){
                        case "13.3":
                            screenPrice = 200;
                            break;
                        case "15.0":
                            screenPrice = 300;
                            break;
                        case "17.3":
                            screenPrice = 400;
                            break;

                    }
        System.out.println("Enter the CPU: ");
            String cPU = input.nextLine();
                    switch(cPU){
                        case "i3":
                            cPUPrice = 150;
                            break;
                        case "i5":
                            cPUPrice = 250;
                            break;
                        case "i7":
                            cPUPrice = 350;
                            break;

                    }
                    System.out.println("Select RAM size:");
            String rAM = input.nextLine();
                    switch(rAM){
                        case "4":
                            rAMPrice = 50;
                            break;
                        case "8":
                            rAMPrice = 100;
                            break;
                        case "12":
                            rAMPrice = 150;
                            break;
                        case "16":
                            rAMPrice = 200;
                            break;
                    }

            System.out.println("Seclect storage type:");
            String type = input.nextLine();

            System.out.println("Seclect storage size:");
            String size = input.nextLine();
                switch (type){
                    case"SSD":
                        if("500".equals(size)){
                            storagePrice=100;
                        } else if ("1000".equals(size)) {
                            storagePrice=200;
                        }
                        break;
                    case"HDD":
                        if("500".equals(size)){
                            storagePrice=50;
                        }
                        else if ("1000".equals(size)){
                            storagePrice=100;
                        }
                        break;
                }
            System.out.println("Select screen resolution:");
            String screen = input.nextLine();
                    switch(screen){
                        case "FULLHD":
                            resolutionPrice = 100;
                            break;
                        case "4K":
                            resolutionPrice = 200;
                            break;
                    }
            totalPrice = (double)(resolutionPrice + storagePrice + rAMPrice + cPUPrice + screenPrice);
            System.out.println("Final price is: $" + totalPrice);


                }
            }