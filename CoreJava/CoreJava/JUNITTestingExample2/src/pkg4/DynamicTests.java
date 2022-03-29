package pkg4;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.function.Executable;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
 
@DisplayName("JUnit 5 Dynamic Tests Example")
@RunWith(JUnitPlatform.class)
public class DynamicTests {

	//@TestFactory-- using for DynamicTest. it always return strem, collection, iterator, Junitexception
	//it should  be used with static or privae methods
	//@BeforeEach,@AfterEach will not call with DynamicTest
	@TestFactory
	Collection<DynamicTest>dynamicTestWithCollection(){
		return  Arrays.asList(
				DynamicTest.dynamicTest("Add Test", ()->assertEquals(2,Math.addExact(988878345, 678899979))),
				DynamicTest.dynamicTest("Multiply Test", ()->assertEquals(4,Math.multiplyExact(2, 2)))
				
				
				
				
				
				
				);
	}

}


