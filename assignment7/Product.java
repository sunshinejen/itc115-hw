import java.text.NumberFormat;

//The product data should include a product code, description, price and product count. 
//In addition to the getter and setter method, the class should implement toString and also a formatted output of the price (Hint: use the NumberFormat class. Here is the implementation of your formattedPrice method: 
//public String getPriceFormatted() 
// {
//   String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
// return formattedPrice;
//}
//From the client app create instance of 2-3 different products and use the toString method to display their data.
//Optional: Keep track of the count of the products created and call the getCount method to verify that it is correct. (Where could you keep track of the count of products?)

public class Product {
	// states of product object
	private String productCode;
	private String productDescription;
	private double price;
	private static int count = 0;

	// constructor
	public Product(String productCode, String productDescription, double price) {
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.price = price;
		count++;
	}

	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}

	// getters & setters

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}

	@Override
	public String toString() {
		return ("Product Code: " + productCode + " \nProduct Description: " + productDescription + "\nPrice: "
				+ getPriceFormatted());
	}

}
