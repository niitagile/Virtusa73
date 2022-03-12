package BasicConcepts;

import java.util.Scanner;

class StudentDetails{
	private int id;
	private String name;
	private int maths,eng,hindi;
	
	void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter 3 sub marks");
		maths=sc.nextInt();
		eng=sc.nextInt();
		hindi=sc.nextInt();
		
	}
	private int calcTotal(){
		return maths+hindi+eng;
	}
	void showStudentDetails() {
		System.out.println("rollno="+id);
		System.out.println("name="+name);
		System.out.println("total="+calcTotal());
	}
}
public class ClassExample {
	public static void main(String[] args) {
		
		/*Normal Objects
		StudentDetails stud1=new StudentDetails();
		stud1.getData();
		
		StudentDetails stud2=new StudentDetails();
		stud2.getData();
		stud1.showStudentDetails();
		stud2.showStudentDetails();
		*/
		
		//Array of Objects
		/*
		StudentDetails studarray[]=new StudentDetails[3];
		for(int i=0;i<studarray.length;i++) {
			studarray[i]=new StudentDetails();
			studarray[i].getData();
			
		}
		
		for(int i=0;i<studarray.length;i++)
			studarray[i].showStudentDetails();
		*/
		
		
		StudentDetails stud3=new StudentDetails();
		stud3.showStudentDetails();
		
		
		
		
	}

}
