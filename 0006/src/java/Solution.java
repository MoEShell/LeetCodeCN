import java.util.LinkedList;

class Solution {
    public String convert(String s, int numRows) {
        String result = "";

        if (numRows == 1)   return s;

        for (int i = 0; i < numRows; i++)
        {
            int j = i;

            while (j < s.length())
            {
                if (i == 0 || i == numRows - 1)
                {
                    result += s.charAt(j);
                    j += numRows * 2 - 2;
                }
                else
                {
                    result += s.charAt(j);
                    int t = numRows * 2 - 2 - i - i;
                    t += j;
                    if (t < s.length()) result += s.charAt(t);

                    j += numRows * 2 - 2;
                }
            }
        }
        return result;
    }

}
