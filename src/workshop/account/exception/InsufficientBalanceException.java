package workshop.account.exception;

public class InsufficientBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String errMessage) {
		//�θ��� �����ڸ� ȣ��
		// this.errMessage = errMessage;
		super(errMessage);
	}
	
}
