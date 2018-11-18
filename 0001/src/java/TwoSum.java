import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum( int[] nums, int target)
    {
        int index;
        int comp;
        Map<Integer, Integer> map = new HashMap<>();

        for ( index = 0; index < nums.length; index++)
        {
            comp = target - nums[index];
            if ( map.containsKey(comp))
            {
                if (map.get(comp) > index)
                    return new int[]{index, map.get(comp)};
                else
                    return new int[]{map.get(comp), index};
            }
            map.put(nums[index], index);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
