package pkg1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExceptions {

	@Test (expected=ArithmeticException.class)
	public void test() {
		CalcDivision obj=new CalcDivision();
		assertEquals(0,obj.divide(5, 0));
	}

}
