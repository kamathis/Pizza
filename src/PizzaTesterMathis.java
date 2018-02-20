
public class PizzaTesterMathis implements PizzaConstants {

	public static void main(String[] args) {

		System.out.println("Welcome to " + COMPANY);
		System.out.println(getSpecial());

		Pizza myPizza = new Pizza("mushroom", "large", 9.99);
		Pizza yourPizza = new Pizza("pepperoni", "extra large", 13.99);
		// Pizza thirdPizza = new Pizza("pepperoni", "extra small", 7.99);
		Order kristi = new Order();
		kristi.addToOrder(myPizza);
		kristi.addToOrder(yourPizza);
		System.out.println(kristi.getOrderTotal());

		System.out.println("Pizza 1 info: " + myPizza.repeatOrder());
		System.out.println("Pizza 2 info: " + yourPizza.repeatOrder());
		// System.out.println("Order 3: " + thirdPizza.repeatOrder());'

	}

	public static String getSpecial() {
		return "Today's special is a large 1-topping pizza for $7.99";
	}
}
