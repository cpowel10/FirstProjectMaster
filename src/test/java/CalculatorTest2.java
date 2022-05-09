import day6.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(value= MethodOrderer.OrderAnnotation.class)
public class CalculatorTest2 {
    Calculator calc;
    int expected;
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all called");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all called");
    }

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
        expected=20;
    }

    @AfterEach
    public void afterEach(){
        calc=null;
        expected=0;
    }

    @Test
    @DisplayName("2. Testing sum with two positive numbers")
    @Order(2)
    public void testCalculatorSum1(){
        int actual = calc.sum(10,10);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("3. Testing sum with one positive number and zero")
    @Order(3)
    public void testCalculatorSum2(){
        int actual = calc.sum(0,20);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("1. Testing sum with one negative number and one positive number")
    @Order(1)
    public void testCalculatorSum3(){
        int actual = calc.sum(30,-10);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("4. Testing subtract with two positive numbers")
    @Order(4)
    public void testCalculatorSubtract(){
        int actual = calc.subtract(30,10);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("6. Testing subtract with one positive number and zero")
    @Order(6)
    public void testCalculatorSubtract2(){
        int actual = calc.subtract(20,0);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("5. Testing subtract with two negative numbers")
    @Order(5)
    public void testCalculatorSubtract3(){
        int actual = calc.subtract(-10,-30);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("7. Testing multiply with two negative numbers")
    @Order(7)
    public void testCalculatorMultiply1(){
        int actual = calc.multiply(-10,-2);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("8. Testing multiply with two positive numbers")
    @Order(8)
    public void testCalculatorMultiply2(){
        int actual = calc.multiply(4,5);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("9. Testing multiply with one positive number and zero")
    @Order(9)
    public void testCalculatorMultiply3(){
        int expected = 0;
        int actual = calc.multiply(10,0);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("10. Testing convert to numbers")
    @Order(10)
    public void testConvertNumbers(){
        int actual = calc.convertToNumber("20");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("11. Testing convert to numbers \"Twenty\"")
    @Order(11)
    public void testConvertNumbers2(){
        assertThrows(NumberFormatException.class, ()->{
            int actual = calc.convertToNumber("Twenty");
            assertEquals(expected,actual);
        });
    }
}
