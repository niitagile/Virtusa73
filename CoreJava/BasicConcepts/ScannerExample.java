package BasicConcepts;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		int num1, num2, ans;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter I value");
		num1=scan.nextInt();
		System.out.println("Enter II value");
		num2=scan.nextInt();
		
		ans=num1+num2;
		System.out.println("Sum="+ans);

	}

}
