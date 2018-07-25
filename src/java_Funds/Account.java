package java_Funds;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int id;
	private Customer customer;
	private AccountStatus status;
	private ShoppingCart cart;
	private List<Address> addresses = new ArrayList<>();
	private List<PaymentMethod> methods = new ArrayList<>();
	
	public void addMethod(PaymentMethod p) {
		methods.add(p);
	}
	
	public void addAddress(Address a) {
		addresses.add(a);
	}
	
	public void destroyMethods() {
		methods = new ArrayList<>();
	}
	
	public void destroyAddresses() {
		addresses = new ArrayList<>();
	}

	public Account(int id, Customer customer, AccountStatus status, ShoppingCart cart, List<Address> addresses,
			List<PaymentMethod> methods) {
		super();
		this.id = id;
		this.customer = customer;
		this.status = status;
		this.cart = cart;
		this.addresses = addresses;
		this.methods = methods;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<PaymentMethod> getMethods() {
		return methods;
	}

	public void setMethods(List<PaymentMethod> methods) {
		this.methods = methods;
	}
	
	
}
