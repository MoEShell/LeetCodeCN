class Solution {
    public int reverse(int x) {
        int result = 0;

        while(x != 0) {
            int tmp = x % 10;
            x /= 10;
            if ((result > Integer.MAX_VALUE / 10) ||((result == Integer.MAX_VALUE / 10) && tmp > 7)) return 0;
            if ((result < Integer.MIN_VALUE / 10) ||((result == Integer.MIN_VALUE / 10) && tmp < -8)) return 0;

            result *= 10;
            result += tmp;

        }

        return result;
    }
}
