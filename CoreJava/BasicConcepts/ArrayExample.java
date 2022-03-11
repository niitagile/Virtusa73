package BasicConcepts;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// Array a collection of similar type of values. array's values always execute on the bases of index no- which always starts with 0
		//diffrent ways to declare array
		/*int marks[]= {23,45,67};
		System.out.println(marks[0]);//23
		//System.out.println(marks[3]); arrayIndexOutofBounds
		System.out.println(marks.length);//3
		//2nd way of declaration
		int arr[]=new int[3];// new--> heap memory
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values for array");
		for(int i=0;i<arr.length;i++){
			
			arr[i]=sc.nextInt();
		System.out.println(arr[i]);
		}
		
		//3rd way 
		int arr1[]=new int[] {34,56,78};
		**************************************************************************************************
		//2D array
		//Ist way of declaration
		int arr3[][]= {
				
				{23,45},
				{34,56}
		};
		
		System.out.println(arr3[1][0]);
		
		//II way
		int arr4[][]=new int[2][2];
		for(int r=0;r<arr4.length;r++) {
			for(int c=0;c<arr4[r].length;c++) {
				arr4[r][c]=sc.nextInt();
				System.out.print(arr4[r][c]);
			}
		}
		***********************************************************************************************************
		*/
		
		//3rd way - jagged array
		int arr5[][]=new int[2][];
		arr5[0]=new int [2];
		arr5[1]=new int[3];
		Scanner sc=new Scanner(System.in);
		// to take values form user
		for(int r=0;r<arr5.length;r++) {
			for(int c=0;c<arr5[r].length;c++) {
				arr5[r][c]=sc.nextInt();
				
			}
			
		}
		//to print values from user
		for(int r=0;r<arr5.length;r++) {
			for(int c=0;c<arr5[r].length;c++) {
				
				System.out.print(arr5[r][c]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
