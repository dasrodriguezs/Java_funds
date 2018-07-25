package java_Funds;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class order {
	private int id;
	private Date modified;
	private OrderStatus status;
	private String shippingAddress;
	private double total;
	private List<LineItem> items = new ArrayList<>();
	
	public order() {
	}
	
	public void addItem(LineItem item) {
		items.add(item);
	}
	
	public double getTotal() {
		total = 0;
		for (int i =0; i<items.size();i++) {
			total += items.get(i).getPrice()*items.get(i).getQuantity();
		}
		return total;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public order(int id, Date modified, OrderStatus status, String shippingAddress, double total,
			List<LineItem> items) {
		super();
		this.id = id;
		this.modified = modified;
		this.status = status;
		this.shippingAddress = shippingAddress;
		this.total = total;
		this.items = items;
	}
	
}
