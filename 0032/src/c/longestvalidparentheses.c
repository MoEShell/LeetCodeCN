int longestValidParentheses(char* s) {
    int i = 0, k;
    int len, max = 0;
    while (s[i] != '\0') {
        if (s[i] == ')'){
            k = i;
            while (k >= 0) {
                if (s[k] == '('){
                    s[i] = '#';
                    s[k] = '#';
                    break;
                }
                --k;
            }
        }
        ++i;
    }
    i = 0;
    len = 0;
    while (s[i] != '\0') {
        if (s[i] != '#'){
            if (max < len)  max = len;
            len = 0;
        }else{
            ++len;
        }
        ++i;
    }
    if (max < len)  max = len;

    return max;
}

