import java.util.ArrayList;

//Kristi Mathis

public class Order {
	
	private double orderTotal = 0;
	private ArrayList<Pizza> customerOrderList;
	
	public Order() {
		System.out.println("A new order is created");
		customerOrderList = new ArrayList<Pizza>();
	}
	
	public double getOrderTotal() {
		return orderTotal;
	}
	public void addToOrder(Pizza p) {
		customerOrderList.add(p);
		this.orderTotal += p.getPrice();
	}

}
