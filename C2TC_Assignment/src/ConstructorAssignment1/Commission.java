package ConstructorAssignment1;
import java.util.Scanner;
class Student{
	Student(){
		System.out.println("Student object is created");
	}
}
public class Commission {
	Scanner sc = new Scanner (System.in);
	private String name, address;
	private double commission=0.0;
	private int amt;
	private long phone;
	
	public Commission() {
		System.out.print("Enter the name: ");
		name=sc.nextLine();
		System.out.print("Enter the address: ");
		address=sc.nextLine();sc.nextLine();
		System.out.print("Enter the Phone Number: ");
		phone=sc.nextLong();
		System.out.print("Enter the amount: ");
		amt=sc.nextInt();
	}
	
	public double calculateCommission() {
		if(amt>=100000) {
			return amt*0.10;
		}else if(amt>=50000) {
			return amt*0.5;
		}else if(amt>=30000) {
			return amt*0.3;
		}
		return 0.0;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
}
