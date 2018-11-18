class Solution {
    public int removeDuplicates(int[] nums) {
        int write = 1, read = 1;

        if(nums == null || nums.length == 0) return 0;

        int num = nums[0];

        while (read < nums.length){
            if (nums[read] != num){
                // 记录该数字
                num = nums[read];
                // 存入数组
                nums[write] = num;
                // 位置右移
                ++write;
            }
            ++read;

        }

        return write;
    }
}
