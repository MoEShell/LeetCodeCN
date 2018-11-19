class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)   return;
        int i = nums.length - 1;

        while(i > 0){
            if (nums[i - 1] < nums[i])  break;

            --i;
        }

        if(i != 0){
            int j;
            for(j = nums.length - 1; j> i; j--){
                if (nums[i - 1] < nums[j])  break;
            }
            int t = nums[i - 1];
            nums[i - 1] = nums[j];
            nums[j] = t;
        }

        for( ; i < nums.length; i++){
            for (int j = nums.length - 1; j > i; j--){
                if (nums[j] < nums[j - 1]){
                    int t = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }
}