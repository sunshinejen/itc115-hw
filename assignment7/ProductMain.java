
public class ProductMain {

	public static void main(String[] args) {
		// Assigns values to product
		Product book1 = new Product("ISBN123", "The Brief Wondrous Life of Oscar Wao", 22.50);
		Product book2 = new Product("ISBN456", "Harry Potter and the Chamber of Secrets", 39.56);
		Product book3 = new Product("ISBD789", "The Way of Kings", 12.45);

		// Displays products
		System.out.println(book1);
		System.out.println();
		System.out.println(book2);
		System.out.println();
		System.out.println(book3);

		// Counts inventory
		System.out.println();
		System.out.println("Inventory: " + Product.getCount());

	}

}
