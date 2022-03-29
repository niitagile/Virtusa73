package pkg4;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase2 {

	@Test
	public void test() {
		Inforamation obj=new Inforamation("java","java123");
		assertEquals(true,obj.validate());
	}

}
