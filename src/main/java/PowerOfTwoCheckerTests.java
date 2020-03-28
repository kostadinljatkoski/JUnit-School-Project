import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoCheckerTests {

    private PowerOfTwoChecker powerOfTwoChecker;

    @BeforeEach
    public void setup() {
        powerOfTwoChecker = new PowerOfTwoChecker();
    }

    @Test
    public void testIsPowerOfTwo1() {
        assertTrue(powerOfTwoChecker.isPowerOfTwo(32));
    }

    @Test
    public void testIsPowerOfTwo1_1() {
        assertEquals(true, powerOfTwoChecker.isPowerOfTwo(32));
    }

    @Test
    public void testIsPowerOfTwo2() {
        assertFalse(powerOfTwoChecker.isPowerOfTwo(55));
    }

    @Test
    public void testIsPowerOfTwo2_2() {
        assertNotEquals(true, powerOfTwoChecker.isPowerOfTwo(55));
    }

    @Test
    public void testIsPowerOfTwo3() {
        assertFalse(powerOfTwoChecker.isPowerOfTwo(200));
    }

    @Test
    public void testIsPowerOfTwo3_2() {
        assertEquals(false, powerOfTwoChecker.isPowerOfTwo(200));
    }

    @Test
    public void testIsPowerOfTwo4() {
        assertFalse(powerOfTwoChecker.isPowerOfTwo(-512));
    }

    @Test
    public void testIsPowerOfTwo4_2() {
        assertNotEquals(true, powerOfTwoChecker.isPowerOfTwo(-512));
    }


    @Test
    public void testIsPowerOfTwo5() {
        assertFalse(powerOfTwoChecker.isPowerOfTwo(0));
    }

    @Test
    public void testIsPowerOfTwo5_2() {
        assertNotEquals(true, powerOfTwoChecker.isPowerOfTwo(0));
    }

    @Test
    public void testIsPowerOfTwo6() {
        assertTrue(powerOfTwoChecker.isPowerOfTwo(1));
    }

    @Test
    public void testIsPowerOfTwo6_2() {
        assertEquals(true, powerOfTwoChecker.isPowerOfTwo(1));
    }

}
