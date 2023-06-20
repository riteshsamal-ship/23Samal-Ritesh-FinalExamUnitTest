import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public static void testNegative1() 
    {
        StringCalculator.add("-1,5");
    }

    @Test
    public static void testNegative2() 
    {
        StringCalculator.add("1,-5");
    }


    @Test
    public static void testMaxInt1() 
    {
        StringCalculator.add("1001,5");
    }

    @Test
    public static void testMaxInt2() 
    {
        StringCalculator.add("1,1005");
    }

}