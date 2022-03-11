package BasicConcepts;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		//String is an imutable class in java.lang package
		String name="Nidhi Gupta";
		
		String name1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter word");
		/*name1=scan.next();//next() takes only 1 word
		System.out.println(name1);*/
		/*name1=scan.nextLine();// to read spaces and enter
		System.out.println(name1);*/
		
		System.out.println("Enter character");
		char ch=scan.next().charAt(0);
		System.out.println(ch);

	}

}
