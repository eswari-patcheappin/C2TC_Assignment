package ConstructorAssignment1;
import java.util.Scanner;
import java.util.ArrayList;
public class Tax {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of student: ");
		int N=sc.nextInt();sc.nextLine();
		ArrayList<Commission>list= new ArrayList<>();
		for(int i=0;i<N;i++) {
			Commission tax = new Commission();
			Student stud = new Student();
			tax.setCommission(tax.calculateCommission());
			list.add(tax);
		}
		for(Commission tax:list) {
			System.out.println("Name : "+tax.getName()+"\nAddress : "+tax.getAddress()+"\nPhone Number: "+tax.getPhone()+"\nSales Amount: "+tax.getAmt()+"\nCommision Amount : "+tax.getCommission());
		}
	}
}
