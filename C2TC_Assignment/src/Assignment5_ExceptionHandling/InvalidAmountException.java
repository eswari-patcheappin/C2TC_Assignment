package Assignment5_ExceptionHandling;

class InvalidAmountException extends Exception {
	public InvalidAmountException(String message) {
		super(message);
	}
}