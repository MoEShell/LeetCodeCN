class Solution {
    public int divide(int dividend, int divisor) {

        boolean flag = true;
        if (dividend < 0)   flag = !flag;
        if (divisor < 0)    flag = !flag;

        long lDiv = Math.abs((long)dividend);
        long lSor = Math.abs((long)divisor);

        // 计算左移步数
        int step = 0;
        while (lSor < lDiv){
            lSor <<= 1;
            ++step;
        }

        long lAnswer = 0;

        // 模拟二进制除法
        while (step >= 0){
            lAnswer <<= 1;
            if (lSor <= lDiv){  // 商 1 的处理
                lAnswer += 1;
                lDiv -= lSor;
            }

            lSor >>>= 1;
            --step;
        }

        // 数值比 2e32 大，无论正负一定溢出
        if (lAnswer > ((long)Integer.MAX_VALUE + 1))    return Integer.MAX_VALUE;
        // 数值等于 2e32 ，若是正数溢出
        if (lAnswer == ((long)Integer.MAX_VALUE + 1) && flag)  return Integer.MAX_VALUE;

        int answer;
        if (flag){
            answer = (int)lAnswer;
        }else {
            answer = ~((int)lAnswer) + 1;
        }

        return answer;

    }
} 
