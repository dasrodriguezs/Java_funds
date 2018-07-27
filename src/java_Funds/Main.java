package java_Funds;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountStatus status = AccountStatus.ACTIVE;
		ShoppingCart cart = new ShoppingCart();
		List<Address> addresses = new ArrayList<>();
		List<PaymentMethod> methods = new ArrayList<>();
		Address a = new Address(1,"87 st","house 5","Auckland","New Zeland",true);
		Date date = new Date(18,07,25);
		OrderStatus ostatus = OrderStatus.CLOSED;
		double total;
		List<LineItem> items = new ArrayList<>();
		
		
				
		Customer customer = new Customer(1,"Daniel",305,"das","1234");
		Account account = new Account(1,customer,status,cart,addresses,methods);
		
		account.addAddress(a);
		addresses = account.getAddresses();
		for (int i = 0;i<addresses.size();i++) {
			System.out.println("Direccion: " + addresses.get(i).getAddress());
		}
		
		Order order = new Order(1,date,ostatus,addresses.get(0).getAddress(),0,items);
			
		Product item1 = new Product(1234,"Coffe","Coffe package");
		Product item2 = new Product(1235,"Milk","Milk package");
		
		LineItem line1 = new LineItem(2,15.5,item1);
		LineItem line2 = new LineItem(4,10,item2);
		
		order.addItem(line1);
		order.addItem(line2);
		
		System.out.println("Total: " + order.getTotal());
		
	}

}
