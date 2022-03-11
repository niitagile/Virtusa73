package BasicConcepts;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		String names[]=new String[5];
		System.out.println(names.length);
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<names.length;i++) {
			System.out.println("Enter name");
			names[i]=scan.nextLine();
			System.out.println(names[i].length());
		}

	}

}
