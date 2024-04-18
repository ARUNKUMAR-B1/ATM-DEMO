import java.util.Scanner;

public class ATM {
    private static double balance = 1000; // Initial balance
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
        System.out.println("Thank you for using the ATM. Goodbye!");
    }
    
    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }
    
    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: $" + balance);
    }
    
    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid amount or insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Your new balance is: $" + balance);
    }
}