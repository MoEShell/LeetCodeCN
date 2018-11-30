class Solution {
    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0)   return -1;
        int index = -1;

        int len = nums.length;
        int min = 0, max = len - 1;
        int mid = (min + max) / 2;

        int left = nums[0];
        int right = nums[max];

        while (min < max) {
            if (nums[mid] == target){
                index = mid;
                break;
            }

            if (target <= right){
                if (nums[mid] >= right || nums[mid] < target){
                    min = mid + 1;
                }else {
                    max = mid;
                }
            }else {
                if (nums[mid] <= left || nums[mid] > target) {
                    max = mid;
                }else {
                    min = mid + 1;
                }
            }
            mid = (min + max) / 2;
        }

        if (min == max){
            if (nums[min] == target)    index = min;
        }

        return index;
    }
} 
