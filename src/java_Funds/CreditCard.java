package java_Funds;

import java.util.Date;

public class CreditCard extends PaymentMethod {
	private double number;
	private Date expDate;
	private int maxInstallements;
	private Issuer issuer;
	
	
	
	public double getNumber() {
		return number;
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



	public int getMaxInstallements() {
		return maxInstallements;
	}



	public void setMaxInstallements(int maxInstallements) {
		this.maxInstallements = maxInstallements;
	}



	public Issuer getIssuer() {
		return issuer;
	}



	public void setIssuer(Issuer issuer) {
		this.issuer = issuer;
	}



	public CreditCard(double number, Date expDate, int maxInstallements, Issuer issuer) {
		super();
		this.number = number;
		this.expDate = expDate;
		this.maxInstallements = maxInstallements;
		this.issuer = issuer;
	}



	public void authorize() {
		
	}
	
}
