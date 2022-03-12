package BasicConcepts;

import java.util.Scanner;

public class MethodExample3 {
	public static void main(String[] args) {
		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int marks[]= {78,67,34,56};
		display(arr);
		display(marks);
	}

	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}	
				
	}

}
