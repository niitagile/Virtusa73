import static org.junit.Assert.*;

import org.junit.Test;

public class AssertExamples {
	
	String str1=new String("abc");
	String str2=new String("abc");
	String str3=null;
	String str4="abc";
	String str5="abc";
	
	
	int val1=5;
	int val2=6;
	String arr1[]= {"one","two"};
	String arr2[]= {"one","two"};

	@Test
	public void test() {
		assertEquals(str1,str2);
		assertTrue(val1<val2);
		assertFalse(val1>val2);
		assertNotNull(str1);
		assertNull(str3);
		assertNotSame(str1,str3);
		assertArrayEquals(arr1,arr2);
		assertNotSame(str1,str4);
	}

}
