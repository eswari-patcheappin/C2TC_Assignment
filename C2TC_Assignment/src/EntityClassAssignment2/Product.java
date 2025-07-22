package EntityClassAssignment2;

public class Product {

	private String name, productId;
	private double price;
	private int quantity;
	
	public Product(String name, String productId, double price, int quantity) {
		this.name=name;
		this.productId=productId;
		this.price=price;
		this.quantity=quantity;
	}
	
	@Override
	public String toString() {
		return "Product Name: "+name+"\nProduct ID: "+productId+"\nProduct Price: "+price+"\nProdut Quantity: "+quantity;
	}
}