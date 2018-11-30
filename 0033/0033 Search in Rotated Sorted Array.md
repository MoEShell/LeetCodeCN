# 搜索旋转排序数组

### 思考

这题是经典的二分法查找的变种，要点是找到向左/向右二分的条件。由旋转排序数组定义可知，在[0,n]的数组上一定存在一个下标k使得[0, k]上的数值一定都大于[k+1, n]，数组的左边界一定不小于数组的右边界。在查找时，如果某个数nums[i]大于右边界，则 [0, i]数值一定都大于右边界，同理如果某个数nums[i]小于左边界，则 [i， n]数值一定都小于左边界。可以以此为依据，以及 target 与边界数字的大小关系来判断向左/向右查找。

### 算法

1. 在数组 nums中查找target设左边界为 left, 右边界为 right。下标min为0, max 为数组长度减一。初始index为 -1
2. 令下标mid =  (min + max) / 2;
3. 如果 muns[mid] 等于 target，令 index = mid
4. 如果 muns[mid] 不等于 target，比较 target与right和left的大小
   1. 如果 targht <= right
      1. 如果 nums[mid] > right 或者 nums[mid] < target：令 min = mid + 1，向右搜索
      2. 否则令 max = mid,向左搜索
   2. 否则表明 target >= left
      1. 如果 nums[mid] < left 或者 nums[mid] > target：令 max = mid,向左搜索
      2. 否则令 min = mid + 1，向右搜索
5. 重复步骤2～4，直到 min 不小于 max为止
6. 如果 min 等于 max，且 nums[min] 等于 target 令 index = min
7. 返回 index

### 学习 

涉及到脚标一定要注意边界检查！无数次在空数组上越界。