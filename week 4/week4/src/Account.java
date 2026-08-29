public class Account {

    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor with zero balance
    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    // Constructor with opening balance
    public Account(String accountNumber, String ownerName, double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            return true;
        }

        return false;
    }

    public boolean withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }

        return false;
    }

    public String toString() {
        return "Account Number: " + accountNumber +
               ", Owner: " + ownerName +
               ", Balance: " + balance;
    }
}