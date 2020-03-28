import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class PowerOfTwoCheckerTimeoutTests {

    private PowerOfTwoChecker powerOfTwoChecker;
    private Long startTime;

    @BeforeEach
    public void setup() {
        powerOfTwoChecker = new PowerOfTwoChecker();
        startTime = System.nanoTime();
    }

    @AfterEach
    public void methodExecutionTime() {
        long timeElapsed = System.nanoTime() - startTime;
        System.out.println("Approximately Execution time in milliseconds: " + timeElapsed / 1000000);
    }

    @Test
    public void testIsPowerOfTwoTimeout1() {
        assertTimeout(Duration.ofMillis(15), () -> powerOfTwoChecker.isPowerOfTwo(2));
    }

    @Test
    public void testIsPowerOfTwoTimeout2() {
        assertTimeout(Duration.ofMillis(15), () -> powerOfTwoChecker.isPowerOfTwo(1073741824));
    }
}
