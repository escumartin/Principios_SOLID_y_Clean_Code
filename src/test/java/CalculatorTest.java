import com.martin.Calculadora;
import com.martin.DivisionByZeroException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testMultiplay() {
        assertEquals(4.6, calculadora.multiply(2.0, 2.3));
    }

    @Test
    public void testDivision() {
        assertEquals(3.0, calculadora.divide(6.0, 2.0));
    }

    @Test
    public void testInvalidDivision() {
        assertThrows(DivisionByZeroException.class, () -> {
            calculadora.divide(6.0, 0.0);
        });
    }

    @Test
    public void testPositiveAbs () {
        assertEquals(calculadora.abs(3.0), 3.0);
    }

    @Test
    public void testNegativeAbs() {
        assertEquals(calculadora.abs(-3.0), 3);
    }

    @Test
    public void testAbs_test() {
        assertEquals(calculadora.abs_test(-6.0), 6.0);
    }
}
