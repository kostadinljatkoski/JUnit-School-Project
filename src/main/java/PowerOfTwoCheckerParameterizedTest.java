import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfTwoCheckerParameterizedTest {

    private PowerOfTwoChecker powerOfTwoChecker;

    @BeforeEach
    public void setup() {
        powerOfTwoChecker = new PowerOfTwoChecker();
    }

    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][] {
                {32, true},
                {55, false},
                {200, false},
                {-512, false},
                {0, false},
                {1, true}
        });
    }

    @ParameterizedTest
    @MethodSource("inputValues")
    public void isPowerOfTwoParameterizedTest(int inputNum, boolean expectedResult) {
        assertEquals(expectedResult, powerOfTwoChecker.isPowerOfTwo(inputNum));
    }
}
