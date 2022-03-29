package pkg2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TiminigTest {

	Messanger obj=new Messanger("Hello Everyone");
	@Test(timeout=1000)
	public void test() {
		obj.printMessgage();
	}

}
