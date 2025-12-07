import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompoundInterestTest {

    @Test
    public void testCalculate() {
        double principal = 1000.0;
        double ratePercent = 5.0; // 5%
        int n = 12;
        int years = 10;

        double result = CompoundInterest.calculate(principal, ratePercent, n, years);

        double r = ratePercent / 100.0;
        double expected = principal * Math.pow(1 + (r / n), n * years);

        assertEquals(expected, result, 1e-9);
    }
}
