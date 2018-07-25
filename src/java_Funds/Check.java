package java_Funds;

public class Check extends PaymentMethod{
	private int number;
	private int bankId;
	private String holder;
	
	public void authorize() {
		
	}

	public Check(int number, int bankId, String holder) {
		super();
		this.number = number;
		this.bankId = bankId;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
}
