package BasicConcepts;

public class OperatorsExmaple {

	public static void main(String[] args) {
		int a=8;
		int b=4;
		System.out.println(a|b); 
		System.out.println(a&b);
		System.out.println(a>>3);// divide no by 2 3 times
		System.out.println(a<<3); // muliply no by 2 3 times
		System.out.println(a>>>2);
		
		String ans=a%2==0?"even":"odd";
		System.out.println(ans);
		

	}

}


/*
Operators
Arithmetic Operators: + - * / %  
Relational : > < >= <= != == 
Logical Operator : && || !
Bitwise Operator & | ! >> << >>>  (int)
increment/decrement operator ++ -- (pre/post)
instanceof
ternary operator ?:
1 0 0 0
0 1 0 0
0 0 0 0  
8/2=> 4/2=> 2==> 2/2==>1

*/