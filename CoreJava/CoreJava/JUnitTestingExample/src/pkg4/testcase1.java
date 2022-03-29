package pkg4;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase1 {

	@Test
	public void test() {
		Inforamation obj=new Inforamation("java","java123");
		assertEquals(7,obj.getLength());
	}

}
