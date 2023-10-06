package ATM;

import java.util.Scanner;

public class Atminterface {
    
    private BankAccount userAccount;
    private Scanner scanner;

    public Atminterface(double initialBalance) {
        userAccount = new BankAccount(initialBalance);
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
    
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    public void checkBalance() {
        double balance = userAccount.getBalance();
        System.out.println("Your account balance is: $" + balance);
    }

    public void deposit() {
        System.out.print("Enter the deposit amount: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            userAccount.deposit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount. Please enter a positive amount.");
        }
    }

    public void withdraw() {
        System.out.print("Enter the withdrawal amount: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (userAccount.withdraw(amount)) {
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive amount.");
        }
    }

    public static void main(String[] args) {
        Atminterface atm = new Atminterface(1000.0); 
        atm.run();
    }
    
}
