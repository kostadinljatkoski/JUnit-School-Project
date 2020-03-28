public class PowerOfTwoChecker {
    public Boolean isPowerOfTwo(Integer num) {
        if(num == null)
            throw new IllegalArgumentException("Argument must not be null");
        if (num > 1) {
            while (num % 2 == 0)
                num /= 2;
        }
        return num == 1;
    }
}