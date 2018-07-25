package java_Funds;

public class Product {
	private int sku;
	private String name;
	private String description;
	
	public Product(int newSku, String newName, String newDescription) {
		sku = newSku;
		name = newName;
		description = newDescription;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
