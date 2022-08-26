package day37_static_methods.card;

public class debitCard {
   /* Create a class for Debit Card that has the following instance variables:
    card number (long), holder name (String), card type (String), pin (int), and balance (double)

    static variables: account type (debit)
            -> Use static block to initialize account type

    Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”

    Overload the constructor to take all of the instance variables. The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print “invalid card type”. Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

    Add the toString method that will print all of the cards information (Except the pin). If the card type does not have a value do not print that line.

    */
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    static String acountType ="debit";

    public debitCard(long cardNumber, String holderName, double balance) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.balance = balance;

        while(pin == 4 ){

            System.out.println("Valid card number");
        }if (pin< 4 && pin > 4){
            System.out.println("Invalid pin length");
        }
    }
    public debitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber, holderName, balance);
        this.pin = pin;
        this.cardType = cardType;
        if (cardType.equalsIgnoreCase("Visa") || cardType.equalsIgnoreCase("MasterCard")) {
            System.out.println("Valid card type");

        }else{
            System.out.println("Invalid card type");
        }
        while(cardNumber == 16 ){

            System.out.println("Valid card number");
        }if (cardNumber < 16 && cardNumber > 16){
            System.out.println("Invalid card number");
        }
    }

    @Override
    public String toString() {
        return "debitCard{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
