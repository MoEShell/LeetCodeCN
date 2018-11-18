class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;

        int half = 0, tmp = x;
        int len;
        len = 0;
        while (tmp > 0){
            tmp /= 10;
            len++;
        }

        for (int i = 0; i < len / 2; i++){
            tmp = x % 10;
            half *= 10;
            half += tmp;
            x /= 10;
        }

        if (len % 2 == 1){
            x /= 10;
        }

        if(half == x) return true;
        else return false;
    }
} 
