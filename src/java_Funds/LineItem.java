package java_Funds;

public class LineItem {
	private int quantity;
	private double price;
	private Product product;
	public LineItem(int quantity, double price, java_Funds.Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
