package pkg3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class ParameterizedTesting {

	MathUtil obj;
	private int input,output;
	@Before
	public void initialize() {
		System.out.println("initaalize method");
		obj=new MathUtil();
	}
	
	@Parameterized.Parameters
	public static Collection squareNumbers() {
		System.out.println("square number method");
		Object answers[][]=new Object[][] {{2,4},{3,10},{5,25}};
		return Arrays.asList(answers);

	}
		
	
	
	public ParameterizedTesting(int input, int output) {
		super();
		this.input = input;
		this.output = output;
		System.out.println("Constructor calling"+input+" "+output);
	}

	@Test
	public void test() {
		System.out.println("Test method");
		assertEquals(output, obj.square(input));
		
	}

}
