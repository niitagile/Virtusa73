package BasicConcepts;

import java.util.Scanner;

public class MethodExample2 {
	public static void main(String[] args) {
		String sentence;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a senetence");
		sentence=sc.nextLine();
		System.out.println(reverse(sentence));
		
	}

	public static String reverse(String sentence) {
		String ans="";
		for(int i=sentence.length()-1;i>=0;i--)
		ans+=sentence.charAt(i);//ans=ans+senetence.charAt(i)
		
		return ans;
	}

}
