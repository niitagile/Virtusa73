package BasicConcepts;

import java.util.Scanner;

//Method - a block of statements which is having 1 name and it performs a task
//method prototype/signature, body, calling statement, parameters/arguments
public class MethodExample {
	
	public static int cube(int num){
		return num*num*num;
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int num=sc.nextInt();
		int ans=MethodExample.cube(num);
		MethodExample.display(ans);

	}


	public static void display(int ans) {
		
		System.out.println("cube of no="+ans);
		
	}

}
