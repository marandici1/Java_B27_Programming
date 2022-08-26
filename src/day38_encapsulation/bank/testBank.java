package day38_encapsulation.bank;

public class testBank {
    public static void main(String[] args) {

    BankAccount account1 = new BankAccount(234567890, 345675678);
    // once is assigned the value can't be changed

        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
    }
}
