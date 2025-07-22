package EntityClassAssignment2;
import java.util.Scanner;
import java.util.ArrayList;
public class ProductManagement {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number product purchased");
		int N=sc.nextInt();sc.nextLine();
		
		ArrayList<Product>list=new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			System.out.print("Enter the Product Name: ");
			String name=sc.nextLine();
			System.out.print("Enter the Product ID: ");
			String productId=sc.nextLine();
			System.out.print("Enter the Product Price: ");
			double price=sc.nextDouble();
			System.out.print("Enter the Product Quantity: ");
			int quantity=sc.nextInt();sc.nextLine();
			Product P = new Product(name,productId,price,quantity);
			list.add(P);
		}
		
		System.out.println("Product Details -->");
		for(Product prod:list) {
			System.out.println(prod);
		}
	}
}