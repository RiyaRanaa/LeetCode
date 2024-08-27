class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
            return -dividend;
        }
        boolean sign = (dividend < 0) == (divisor < 0);

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long quotient = 0;
        while (n >= d) {
            int count = 0;
            while (n >= (d << (count + 1))) {
                count++;
            }
            quotient += 1L << count;
            n -= d << count;
        }
        if (quotient >= (1L << 31)) {
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return sign ? (int) quotient : -(int) quotient;
    }
}
