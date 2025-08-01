package Assignment5_ExceptionHandling;

public class BankAccount {
		private int accountNumber;
		private double balance;

		// Parameterized constructor to initialize account details
		public BankAccount(int accountNumber, double initialBalance) {
			this.accountNumber = accountNumber;
			this.balance = initialBalance;
		}

		// Method to deposit amount into the account
		public void deposit(double amount) throws InvalidAmountException {
			if (amount <= 0) {
			throw new InvalidAmountException("Deposit amount must be positive.");
			}
		balance += amount;
		System.out.println("Successfully deposited: ₹" + amount);
		}
		// Method to withdraw amount from the account
		public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
		if (amount <= 0) {
		throw new InvalidAmountException("Withdrawal amount must be positive.");
		}
		if (amount > balance) {
		throw new InsufficientFundsException("Insufficient funds. Available balance: ₹" + balance);
		}
		balance -= amount;
		System.out.println("Successfully withdrawn: ₹" + amount);
		}

		// Method to display current balance
		public void displayBalance() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: ₹" + balance);
		}
}
