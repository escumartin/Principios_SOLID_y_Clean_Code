import com.martin.Calculadora;
import com.martin.DivisionByZeroException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void testMultiplay() {
        assertEquals(4.6, calculadora.multiply(2.0, 2.3));
    }

    @Test
    void testDivision() {
        assertEquals(3.0, calculadora.divide(6.0, 2.0));
    }

    @Test
    void testInvalidDivision() {
        assertThrows(DivisionByZeroException.class, () -> {
            calculadora.divide(6.0, 0.0);
        });
    }

    @Test
    void testPositiveAbs () {
        assertEquals(3.0, calculadora.abs(3.0));
    }

    @Test
    void testNegativeAbs() {
        assertEquals(3, calculadora.abs(-3.0));
    }

    @Test
    void testAbs_test() {
        assertEquals(6.0, calculadora.abs_test(-6.0));
    }
}
