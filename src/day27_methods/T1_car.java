package day27_methods;

import java.util.Arrays;

public class T1_car {
    public static void unlock(){
        System.out.println("Unlocking T1_car");

    }
    public static void  openDoor(){
        System.out.println("Opening the door");
    }
    public static void sitDownStart(){
        System.out.println("Sitting down in seat");
        System.out.println("Then insert the key");
        System.out.println("Start the T1_car");
    }

    public static void checkMirrors(){
        System.out.println("Checking left mirror");
        System.out.println("Checking rear view mirror");
        System.out.println("Checking right mirror");

    }

    public static void putOnSeatBelt(){
        System.out.println("Putting on seatbelt");
    }
    public static void drive(){
        System.out.println("Putting in to drive");
        System.out.println("Pressing on the accelerator");
    }
    public static void late(){
        unlock();
        openDoor();
        sitDownStart();
        drive();
    }

    public static void main(String[] args) {
        unlock();
        openDoor();
        sitDownStart();
        checkMirrors();
        putOnSeatBelt();
        drive();

        System.out.println();

        late();

        int[] arr = {4, 2, 5, 7, 2, 3};
        boolean[] bArr =
                new boolean[arr.length];
        for (int i = 0; i
                < arr.length; i++) {
            bArr[i]
                    =
                    arr[i] % 2
                            == 0;
            System.out.print(Arrays.toString(bArr));
        }
    }
}
