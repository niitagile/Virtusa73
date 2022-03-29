import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Before;
public class MethodsCalling {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("After class");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Test
	public void test1() {
		System.out.println("Test case1");
	}
	@Test
	public void test2() {
		System.out.println("Test case2");
	}
}
