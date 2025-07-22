package EntityClassAssignment1;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentManagement {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Student> list = new ArrayList<>();
		System.out.print("Enter the numbe of students: ");
		int N=sc.nextInt();sc.nextLine();
		for(int i=0;i<N;i++) {
			System.out.print("Enter the Name of the student: ");
			String name=sc.nextLine();
			System.out.print("Enter the Roll Number: ");
			int roll=sc.nextInt();sc.nextLine();
			System.out.print("Enter the Registration Number: ");
			String reg=sc.nextLine();
			System.out.print("Enter the Department: ");
			String dept=sc.nextLine();
			System.out.print("Enter the mobile Number: ");
			long mobile=sc.nextLong();sc.nextLine();
			System.out.print("Enter the Student Address: ");
			String address=sc.nextLine();
			Student S=new Student(name,roll,reg,dept,mobile,address);
			list.add(S);
		}
		
		System.out.println("The Student Details -->");
		for(Student stud:list) {
			System.out.println(stud.toString());
		}
	}
}