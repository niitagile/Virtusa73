package pkg2;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
 
@DisplayName("JUnit 5 Repeated Tests Example")
@RunWith(JUnitPlatform.class)
public class RepeatedTests {
         
         
            @Test
            @DisplayName("Add operation test")
            @RepeatedTest(5)
            void addNumber() {
                Calculator calculator = new Calculator();
                assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
                System.out.println("===addNumber testcase executed===");
            }
             
          
}
