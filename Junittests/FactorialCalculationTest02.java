package Junittests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

public class FactorialCalculationTest02 {

    FactorialCalculation calculator = new FactorialCalculation();

    @Test
    public void testFactorialWithinTimeLimit() {
        assertTimeout(Duration.ofMillis(1000), () -> {
            long result= calculator.calculatefactorial(4);
            assertEquals(24, result, "4! უდრის 24-ს");
        });
    }


    @Test
    public void testFactorialNegativeNumberThrowsException() {
        assertTimeout(Duration.ofMillis(1000), () -> {
            IllegalArgumentException exception= assertThrows(IllegalArgumentException.class, () -> {
                calculator.calculatefactorial(-3);
            });

            assertEquals("შეყვანილი რიცხვი უდნა იყოს დადებითი", exception.getMessage());
        });
    }



}
