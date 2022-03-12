package BasicConcepts;

import java.util.Date;
import java.util.Scanner;
class Student{
	void display() {}
}

class Employee{}
public class ObjectsExample {

	public static void main(String[] args) {
		String name=null;// reference object
		String sen=new String();//instance object
		Scanner sc=new Scanner(System.in);
		String sen1=sen;//reference object containing address on sen
		
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		Student stud=new Student();
		stud.display();
		Employee emp=new Employee();
	}

}
