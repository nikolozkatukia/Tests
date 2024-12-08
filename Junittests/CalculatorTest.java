package Junittests;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator=new Calculator();

    @Test
    public void testAdd1() {
        double result= calculator.add(1, 3);
        assertEquals(4, result, "1+3 მოსალოდნელი პასუხია 4");
    }

    @Test
    public void testAdd2() {
        double result=calculator.add(-4,-3);
        assertEquals(-10,result, " -4-ის და -3-ის ჯამი უნდა უდრიდეს -7");
    }

    @Test
    public void testSubtract1() {
        double result= calculator.add(10, 4);
        assertEquals(6, result, "10-4 მოსალოდნელი პასუხია 6");
    }

    @Test
    public void testSubtract2() {
        double result= calculator.add(-10, 4);
        assertEquals(-14, result, "-10-4 მოსალოდნელი პასუხია -14");
    }

    @Test
    public void testMultiply1() {
        double result= calculator.multiply(4, 5);
        assertEquals(20, result, "4*5 მოსალოდნელი პასუხია 20");
    }

    @Test
    public void testMultiply2() {
        double result= calculator.multiply(-4, 5);
        assertEquals(-20, result, "-4*5 მოსალოდნელი პასუხია -20");
    }

    @Test
    public void testDivide1() {
        double result= calculator.divide(45, 9);
        assertEquals(5, result, "45/9 მოსალოდნელი პასუხია 5");
    }

    @Test
    public void testDivide2() {
        Exception exception= assertThrows(ArithmeticException.class, () -> {
            calculator.divide(45, 0);
        });
        assertEquals("0-ზე გაყოფა არ შეიძლება", exception.getMessage());
    }


}
