package Junittests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculationTest {

    FactorialCalculation calculator= new FactorialCalculation();

    @Test
    public void testFactorialPositiveCase() {
        long result= calculator.calculatefactorial(5);
        assertEquals(120, result, "7! უდრის 5040-ს");
    }

    @Test
    public void testFactorialNegativeNumberThrowsException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculatefactorial(-3);
        }, "შეყვანილი რიცხვი არუნდა იყოს უარყოფითი");

        assertEquals("შეყვანილი რიცხვი არუნდა იყოს უარყოფითი", exception.getMessage());

    }
}

