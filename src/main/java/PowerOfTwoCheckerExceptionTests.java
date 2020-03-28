import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoCheckerExceptionTests {

    private PowerOfTwoChecker powerOfTwoChecker;

    @BeforeEach
    public void setup() {
        powerOfTwoChecker = new PowerOfTwoChecker();
    }

    @Test
    public void isPowerOfTwoShouldThrowAnExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> powerOfTwoChecker.isPowerOfTwo(null));
    }

    @Test
    public void isPowerOfTwoShouldThrowAnExceptionTestWithMessage() {
        String exceptionMessage = "Argument must not be null";
        assertThrows(IllegalArgumentException.class, () -> powerOfTwoChecker.isPowerOfTwo(null), exceptionMessage);
    }

    @Test
    public void isPowerOfTwoShouldNotThrowAnExceptionTest() {
        assertDoesNotThrow(() -> powerOfTwoChecker.isPowerOfTwo(64));
    }
}
