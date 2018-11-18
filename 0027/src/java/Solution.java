class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)   return 0;

        int write = 0, read = 0;

        while (read < nums.length){
            if(val != nums[read]){
                nums[write] = nums[read];
                ++write;
            }
            ++read;
        }

        return write;
    }
}
