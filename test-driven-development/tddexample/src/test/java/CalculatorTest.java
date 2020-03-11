import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void addTest(){
        assertEquals(9, calculator.add(5,4));
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void subtractTest(){
        assertEquals(3, calculator.subtract(7,4));
        assertEquals(12, calculator.subtract(20,8));
    }

    @Test
    public void powerTest(){
        assertEquals(16, calculator.power(4,2));
        assertEquals(27, calculator.power(3,3));
    }

    @Test
    public void powerTest_positiveValueZeroPower(){
        assertEquals(1, calculator.power(3,0));
    }

    @Test
    public void powerTest_negativeValueZeroPower(){
        assertEquals(1, calculator.power(-3,0));
    }

    @Test
    public void powerTest_positiveValueNegativePower(){
        assertEquals(0.04, calculator.power(5,-2), 0.001);
        assertEquals(0.0625, calculator.power(4,-2), 0.001);
    }

    @Test
    public void powerTest_negativeValuePositivePower(){
        assertEquals(9, calculator.power(-3,2));
        assertEquals(-27, calculator.power(-3,3));
    }

    @Test
    public void powerTest_negativeValueNegativePower(){
        assertEquals(0.04, calculator.power(-5,-2),0.001);
        assertEquals(-0.008, calculator.power(-5,-3),0.001);
    }

    @Test
    public void powerTest_zeroValuePositivePower(){
        assertEquals(0, calculator.power(0,9));
    }
    @Test
    public void powerTest_zeroValueZeroPower(){
        assertThrows(ArithmeticException.class, () -> calculator.power(0,0));
    }

    @Test
    public void powerTest_zeroValueNegativePower(){
        assertThrows(ArithmeticException.class, () -> calculator.power(0,-127));
    }


}
