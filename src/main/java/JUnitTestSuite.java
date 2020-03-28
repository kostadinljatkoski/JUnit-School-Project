import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PowerOfTwoCheckerTests.class,
        PowerOfTwoCheckerTimeoutTests.class,
        PowerOfTwoCheckerParameterizedTest.class,
        PowerOfTwoCheckerExceptionTests.class})
public class JUnitTestSuite {
}
