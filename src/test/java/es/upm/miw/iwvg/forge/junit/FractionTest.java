package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(1, 2);
    }

    @Test
    void testDecimal() {
        assertEquals(0.5, this.fraction.decimal());
    }

    @Test
    void testNumerator() {
        assertEquals(1, this.fraction.getNumerator());
    }

    @Test
    void testDenominator() {
        assertEquals(2, this.fraction.getDenominator());
    }

    @Test
    void testIsPropia() {
        assertTrue(new Fraction(1, 5).isPropia());
    }

    @Test
    void testIsImpropia() {
        assertTrue(new Fraction(10, 2).isImpropia());
    }

    @Test
    void testIsMenorQue(){
        Fraction newFraction = new Fraction();
        assertTrue(this.fraction.isMenorQue(newFraction));
    }
}
