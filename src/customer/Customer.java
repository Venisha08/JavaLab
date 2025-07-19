package customer;

import bank.BankAccount;

public class Customer {
    private String customerName;
    private BankAccount customerAccount;

    // Constructor
    public Customer(String name, BankAccount account) {
        this.customerName = name;
        this.customerAccount = account;
    }

    // Perform Transactions
    public void performTransactions(double depositAmt, double withdrawAmt) {
        System.out.println("\n--- Transaction for " + customerName + " ---");
        customerAccount.deposit(depositAmt);
        customerAccount.withdraw(withdrawAmt);
        customerAccount.showAccountInfo();
    }
}
