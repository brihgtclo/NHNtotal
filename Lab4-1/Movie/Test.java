package Movie;

public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount.accountNumber = 103;
        account1.balance = 100;
        account1.ownerName = "Celine";

        BankAccount account2 = new BankAccount();
        BankAccount.accountNumber = 104;
        account2.balance = 100;
        account2.ownerName = "James";

        System.out.println(BankAccount.accountNumber);
    }
}
