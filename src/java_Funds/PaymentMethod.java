package java_Funds;

public abstract class PaymentMethod {
	private int id;

	public PaymentMethod() {
	}
	
	public abstract void authorize();
	
}
