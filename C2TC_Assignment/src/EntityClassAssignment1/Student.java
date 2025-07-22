package EntityClassAssignment1;

public class Student {
	
	private String name, address, dept, reg;
	private int roll;
	private long mobile;
	
	public Student(String name, int roll, String reg, String dept, long mobile, String address) {
		this.name=name;
		this.roll=roll;
		this.reg=reg;
		this.dept=dept;
		this.mobile=mobile;
		this.address=address;
	}
	
	@Override
	public String toString() {
		return "Name of the Student: "+name+"\nStudent Roll Number: "+roll+"\nStudent Register Number: "+reg+"\nStudent Department: "+dept+"\nStudent Mobile Number: "+mobile+"\nStudent Address: "+address;
	}
}