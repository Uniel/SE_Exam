package app;
// Andreas
public class OperationNotAllowedException extends Exception{

	private static final long serialVersionUID = 1L;

	// Andreas
	public OperationNotAllowedException(String errorMessage) {
		super(errorMessage);
	}
}
