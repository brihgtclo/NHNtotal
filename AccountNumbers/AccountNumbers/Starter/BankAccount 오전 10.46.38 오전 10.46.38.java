import java.math.*;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;



    public void setData(long accountNumber, String ownerName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public BigDecimal getBalance() {
        return balance;
    }


}

class CreateAccount {
    public static BankAccount createNewBankAccount(long accountNumber, String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        newAccount.setData(accountNumber,ownerName,balance);

        return newAccount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = CreateAccount.createNewBankAccount(1, "Vesper Lind", new BigDecimal("0.0"));
        printBankAccount(bankAccount);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}
