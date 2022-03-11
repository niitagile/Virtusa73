package BasicConcepts;

import java.util.Scanner;

public class CharacterArrayExample {

	public static void main(String[] args) {
		char ch='e';
		char name[]=new char[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<name.length;i++) {
			name[i]=scan.next().charAt(0);
		}
		System.out.println(name.toString());// toString() is method of Object class 
		
		/*int arr[]= {56,67,78};
		System.out.println(arr.toString());*/
		
		
	}

}
