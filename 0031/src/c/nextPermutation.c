void nextPermutation(int* nums, int numsSize) {
    if (nums == NULL || numsSize == 0)  return;

    int i = numsSize - 1;

    while(i > 0){
        if (nums[i] > nums[i - 1])  break;
        --i;
    }

    if(i != 0){
        int j;
        for (j = numsSize - 1; j > i; --j){
            if(nums[j] > nums[i - 1])   break;
        }
        int t = nums[j];
        nums[j] = nums[i - 1];
        nums[i - 1] = t;
    }

    for( ; i < numsSize; ++i){
        for (int j = numsSize - 1; j > i; --j){
            if (nums[j] < nums[j - 1]){
                int t = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = t;
            }
        }
    }
}