package isp.lab2.Exercise3SumOfIntegersRecursive;

public class SumOfIntegersRecursive {

    @Test
    public void testSumOfIntegers() {
        int n = 5;
        int expected = 15;
        int actual = SumOfIntegers.sum(n);
        assertEquals(expected, actual);
    }
}
