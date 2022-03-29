import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		Calculation obj=new Calculation();
		
		assertEquals(11, obj.addition(5, 6));
	
	}
	@Test
	public void test1() {
		Calculation obj=new Calculation();
		
		assertEquals(11, obj.addition(6, 6));
	
	}
}
