public class BankAccount {

    public static void main(String[] args) {

        Account a1 = new Account("A101", "Rahul");
        Account a2 = new Account("A102", "Aman", 5000);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("\nDeposits:");

        System.out.println(a1.deposit(1000));   // positive
        System.out.println(a1.deposit(0));      // zero
        System.out.println(a1.deposit(-500));   // negative

        System.out.println(a1);

        System.out.println("\nWithdrawals:");

        System.out.println(a2.withdraw(2000));  // valid
        System.out.println(a2.withdraw(5000));  // excessive

        System.out.println(a2);

        System.out.println("\nTwo independent accounts:");

        a1.deposit(500);

        System.out.println(a1);
        System.out.println(a2);
    }
}