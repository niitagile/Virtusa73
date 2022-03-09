package BasicConcepts;

import java.util.Scanner;

public class ScannerExample1 {
	public static void main(String[] args) {
		float num1, num2, ans;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter I value");
		num1=scan.nextFloat();
		System.out.println("Enter II value");
		num2=scan.nextFloat();
		
		ans=num1+num2;
		System.out.println("Sum="+ans);
	}

}


