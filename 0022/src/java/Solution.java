import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        LinkedList<String> list = new LinkedList<>();
        String str = "";
        CreateString(list, str, 0, 0, n);
        return list;
    }

    private void CreateString(LinkedList<String> list, String str, int open, int close, int n) {
        if( str.length() >= n * 2){
            list.add(str);
            return;
        }

        if(open < n)   CreateString(list, str + '(', open + 1, close, n);
        if(close < open)    CreateString(list, str + ')', open, close + 1, n);
    }


}
