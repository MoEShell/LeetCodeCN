import java.util.HashMap;
import java.util.LinkedList;

class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> list = new LinkedList<Character>();
        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for ( int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')  list.addLast(s.charAt(i));
            else{
                if (list.isEmpty() || list.getLast() != map.get(s.charAt(i))) return false;
                list.removeLast();
            }
        }

        if (!list.isEmpty()) return false;
        return true;
    }
} 
