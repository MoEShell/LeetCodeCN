class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null )    return -1;
        if (needle.length() == 0)   return 0;

        int index = -1;

        for(int i = 0; i < haystack.length(); i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                int j = 0, k = i;
                while (k < haystack.length() && j < needle.length()){
                    if (needle.charAt(j) != haystack.charAt(k)){
                        break;
                    }
                    j++;
                    k++;
                }

                if (j == needle.length()){
                    index = i;
                    break;
                }
            }
        }

        return index;

    }
}
