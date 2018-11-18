class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = "";

        if (strs == null || strs.length == 0)   return "";

        loop: while (true){
            for( int i = 0; true; i++){
                if (i >= strs[0].length())  break loop;

                char ch = strs[0].charAt(i);

                for ( String str : strs){
                    if (i >= str.length())  break loop;

                    if(ch != str.charAt(i)) break loop;
                }
                pre += String.valueOf(ch);
            }

        }

        return pre;
    }
} 
