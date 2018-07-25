package java_Funds;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<LineItem> items = new ArrayList<>();

	public ShoppingCart() {
	}
	
	public void addItem(LineItem item) {
		items.add(item);
	}
	
	public void cleanCart() {
		items.clear();
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}

	public ShoppingCart(List<LineItem> items) {
		super();
		this.items = items;
	}
	

}
