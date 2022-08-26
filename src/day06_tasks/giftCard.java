package day06_tasks;

public class giftCard {
    public static void main(String[] args) {
        /* create a class GiftCard

    declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end

         */
        int giftCard = 500;
        System.out.println("Giftcard " + giftCard);
        int timesUsed = 3;
        System.out.println("Using giftcard. Remaining balance : ");
        int usingGiftCard = giftCard - 150;
        System.out.println (usingGiftCard);

        --timesUsed ;
        System.out.println("Using giftcard. Remaining balance : ");
        int usingGiftCard2 = usingGiftCard - 99;
        System.out.println(usingGiftCard2);

        --timesUsed;
        System.out.println("Number of times card can be used: " + timesUsed);

        /*  the wright way:
        double giftCard = 500;
        int uses = 3;
        System.out.println("Using giftcard. $150 removed");
        giftCard -= 150; // giftCard = giftCard - 150;
        uses--;
        System.out.println("Using giftcard. $99 removed");
        giftCard -= 99; // giftCard = giftCard - 150;
        uses--;
        System.out.println("Gift card balance left $ " + giftCard);
        System.out.println("Number of times card can be used: " + uses);
         */


       /* What is the value of a and b

        int a = 8;
        int b = a--;

        what is a?
                what is b?
        */

        int a =8;
        int b = a--;
        System.out.println(a); // 7
        System.out.println(b);  // 8
    }
}
