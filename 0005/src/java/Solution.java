import java.util.LinkedList;

class Solution {
    public String longestPalindrome(String s) {
        LinkedList<Flags> flagList = new LinkedList<>();

        Flags result = new Flags(0, -1);

        if (s.length() == 0)    return  "";

        for ( int i = 0; i < s.length(); i++)
        {
            flagList.add(new Flags(i, i));
            result.start = i;
            result.end = i;
        }


        for(int i = 0; i < s.length()- 1; i++)
        {
            if (s.charAt(i) == s.charAt(i + 1))
            {
                flagList.add(new Flags(i, i+1));
                result.start = i;
                result.end = i + 1;
            }
        }

        while (!flagList.isEmpty())
        {
            Flags f = flagList.getFirst();
            flagList.removeFirst();
            if (f.start > 0 && f.end < s.length() - 1)
            {
                if(s.charAt(f.start - 1) == s.charAt(f.end + 1))
                {
                    flagList.add(new Flags(f.start - 1, f.end + 1));
                    result.start = f.start - 1;
                    result.end = f.end + 1;

                }
            }
        }

        return s.substring(result.start, result.end + 1);
    }
}

class Flags {
    int start;
    int end;
    Flags(int i, int j)
    {
        start = i;
        end = j;
    }
}
