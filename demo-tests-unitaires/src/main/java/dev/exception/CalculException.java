package dev.exception;

public class CalculException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9151883460325317628L;
	
	public CalculException() {
		super("Expression non valide");
	}

}
