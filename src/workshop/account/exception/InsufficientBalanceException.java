package workshop.account.exception;

public class InsufficientBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String errMessage) {
		//부모의 생성자를 호출
		// this.errMessage = errMessage;
		super(errMessage);
	}
	
}
