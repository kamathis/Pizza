//Kristi Mathis

public class Pizza extends MenuItem {
	
	private String topping;
	private String size;
	private double price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;
	
	public Pizza(String topping, String size, double price) {
		setTopping(topping);
		setSize(size);
		setPrice(price);
		nextOrderNumber++;;
		this.orderNumber = nextOrderNumber;
		
		if (getSize().equals("error")) {
			throw new IllegalArgumentException("Pizza not created.");
		}
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
			this.topping = topping;
		}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		size = size.toLowerCase();
		if(size.equals("small") || size.equals("medium") || size.equals("large") || size.equals("extra large")) {
		this.size = size;
		}else {
			this.size = "error";
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String repeatOrder() {
		return super.getDescription() + "Order number: " + getOrderNumber() + ", Size: " + getSize() + ", Topping: " + getTopping() + ", Price: $" + getPrice();
	}
	



}
