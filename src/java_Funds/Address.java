package java_Funds;

public class Address {
	private int id;
	private String lineOne;
	private String lineTwo;
	private String city;
	private String country;
	private boolean bilingAddress;
	
	
	
	public Address(int id, String lineOne, String lineTwo, String city, String country, boolean bilingAddress) {
		super();
		this.id = id;
		this.lineOne = lineOne;
		this.lineTwo = lineTwo;
		this.city = city;
		this.country = country;
		this.bilingAddress = bilingAddress;
	}



	public String getAddress() {
		String address = lineOne + ' ' + lineTwo + ',' + city + '(' + country + ')';
		return address;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getLineOne() {
		return lineOne;
	}



	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}



	public String getLineTwo() {
		return lineTwo;
	}



	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public boolean isBilingAddress() {
		return bilingAddress;
	}



	public void setBilingAddress(boolean bilingAddress) {
		this.bilingAddress = bilingAddress;
	}
	
	
}
