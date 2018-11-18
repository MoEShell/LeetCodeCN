import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s)
    {
        int max = 0;
        int len = s.length();

        Set<Character> set = new HashSet<Character>();

        int i = 0, j = 0, num = 0;

        while ( i < len && j < len)
        {
            if (set.contains(s.charAt(j)))
            {
                max = Math.max(max, num);
                num--;
                set.remove(s.charAt(i));
                i++;
            }
            else
            {
                set.add(s.charAt(j));
                j++;
                num++;
            }
        }

        max = Math.max(max, num);

        return max;
    }
}
