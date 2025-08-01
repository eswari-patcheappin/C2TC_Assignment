package Assignment5_ExceptionHandling;

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}