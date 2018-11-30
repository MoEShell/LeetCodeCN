public class Solution {
    public int longestValidParentheses(String s){
        int max = 0, len = 0;

        char [] chs = s.toCharArray();

        int i = 0, k = -1;

        while (i < chs.length){
            if(chs[i] == ')'){
                k = i;
                while (k >= 0){
                    if (chs[k] == '('){
                        chs[k] = '#';
                        chs[i] = '#';
                        break;
                    }
                    --k;
                }
            }
            ++i;
        }

        i = 0;
        while (i < chs.length){
            if (chs[i] != '#'){
                if (max < len)  max = len;
                len = 0;
            }else {
                ++len;
            }
            ++i;
        }
        if (max < len)  max = len;

        return max;
    }
}

