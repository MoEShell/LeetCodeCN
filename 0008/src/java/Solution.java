class Solution {
    public int myAtoi(String str) {

        int i = 0;
        boolean flag = true;
        int rev = 0;

        // 空字符串
        if (str.length() == 0) return  0;

        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        // 空白字符串
        if ( i >= str.length()) return 0;

        // 第一个非空字符不是数字或正、负号
        if (str.charAt(i) > '9' && str.charAt(i) < '0' && str.charAt(i) != '+' && str.charAt(i) != '-') return 0;

        if (str.charAt(i) == '+'){
            flag = true;
            i++;
        }else if (str.charAt(i) == '-'){
            flag = false;
            i++;
        }

        while (i < str.length()){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                if (flag){
                    if ((rev > Integer.MAX_VALUE / 10) ||((rev == Integer.MAX_VALUE / 10) && ch > '7')){
                        return Integer.MAX_VALUE;
                    }
                    else{
                        rev *= 10;
                        rev += (int)(ch - '0');
                    }
                }
                else {
                    if ((rev < Integer.MIN_VALUE / 10) || ((rev == Integer.MIN_VALUE / 10) && ch > '8')) return Integer.MIN_VALUE;
                    rev *= 10;
                    rev += (-1) * (ch - '0');
                }
            }
            // 有效数字后首个非数字字符
            else break;

            i++;
        }

        return rev;
    }
}
