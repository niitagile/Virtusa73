package BasicConcepts;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Basic Calculator
		float num1, num2;
		Scanner scan =new Scanner(System.in);
		label:
		while(true) {
		
		System.out.println("enter 1 Add, 2, Sub, 3 Mult, 4 Div 0 exit");
		int choice= scan.nextInt();
		System.out.println("Enter I value");
		num1=scan.nextFloat();
		System.out.println("Enter II value");
		num2=scan.nextFloat();
		
		switch(choice) {
		case 1: System.out.println("sum="+(num1+num2));break;
		case 2: if(num1>num2) 
				System.out.println("difference="+(num1-num2));
		
				else
					System.out.println("difference="+(num1-num2));
		break;
		case 3: System.out.println("product="+(num1*num2));	
		break;
		case 4: if(num2==0)
				System.out.println("division by zero not possible");
				else {
		  		System.out.println("Quotient="+(num1/num2));
				System.out.println("Remender="+(num1%num2));
				}
		break;
		case 0: break label;
		default: System.out.println("Wrong Input");
		
		}
		}
}
}


/* switch(variable) short, int, String, byte, enum{
 * case val: statements; break;
 * case val: statments; break;
 *  default: statement;
 *  }
 *  
 */