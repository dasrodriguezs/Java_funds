package java_Funds;

import java.util.Date;

public class DebitCard extends PaymentMethod{
	private double number;
	private Date expDate;
	private Issuer issuer;
	
		
	public void authorize() {
		
	}

	public double getNumber() {
		return number;
	}

	public DebitCard(double number, Date expDate, Issuer issuer) {
		super();
		this.number = number;
		this.expDate = expDate;
		this.issuer = issuer;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Issuer getIssuer() {
		return issuer;
	}

	public void setIssuer(Issuer issuer) {
		this.issuer = issuer;
	}

}
