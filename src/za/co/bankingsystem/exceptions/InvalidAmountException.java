package za.co.bankingsystem.exceptions;

public class InvalidAmountException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "Invalid Amount";

	public InvalidAmountException() {
		super(MESSAGE);
	}

	public InvalidAmountException(String message) {
		super(message);
	}
}
