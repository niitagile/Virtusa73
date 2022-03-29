package pkg5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCases {

	Calculator obj=new Calculator();
	@Test
	void test() {
		assertEquals(2,obj.addition(1, 1));
		
	}

	@Disabled
	@Test
	void test1() {
		assertEquals(4,obj.multiply(2, 2));
		
	}
	
}
