import bank.BankAccount;
import customer.Customer;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();

        // Create BankAccount and Customer
        BankAccount account = new BankAccount(name, balance);
        Customer customer = new Customer(name, account);

        // Perform transactions
        customer.performTransactions(deposit, withdraw);
    }
}
