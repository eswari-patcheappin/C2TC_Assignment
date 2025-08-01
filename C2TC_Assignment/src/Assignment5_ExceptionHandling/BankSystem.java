package Assignment5_ExceptionHandling;

public class BankSystem {
	public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount myAccount = new BankAccount(1001, 5000.0);

        try {
            myAccount.displayBalance(); // Show current balance

            // Perform deposit
            myAccount.deposit(2000);

            // Perform withdrawal
            myAccount.withdraw(3000);

            // Attempt to withdraw more than balance to trigger exception
            myAccount.withdraw(5000);

        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\n--- Transaction Summary ---");
            myAccount.displayBalance(); // Final balance display
        }
    }
}
