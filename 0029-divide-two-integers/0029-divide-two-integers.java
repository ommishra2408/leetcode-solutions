
class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int sign = 1;

        if ((dividend < 0 && divisor > 0) ||
            (dividend > 0 && divisor < 0)) {
            sign = -1;
        }

        long ans = 0;

        while (a >= b) {
            long temp = b;
            long count = 1;

            while (a >= (temp << 1)) {
                temp = temp << 1;
                count = count << 1;
            }

            a = a - temp;
            ans = ans + count;
        }

        if (sign == -1) {
            return (int)(-ans);
        }

        return (int)ans;
    }
}
