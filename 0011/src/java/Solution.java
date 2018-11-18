class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int tmpArea;
        int left, right;
        int leftHeight, rightHeight;
        int min, max;

        left = 0;
        leftHeight = height[left];
        right = height.length - 1;
        rightHeight = height[right];

        while (left < right){
            if(leftHeight <= rightHeight){
                if(leftHeight <= height[left]){
                    leftHeight = height[left];
                    tmpArea = (right - left) * Math.min(leftHeight, rightHeight);
                    if(tmpArea > area){
                        area = tmpArea;
                    }
                }
            }
            else{
                if (rightHeight <= height[right]){
                    rightHeight = height[right];
                    tmpArea = (right - left) * Math.min(leftHeight, rightHeight);
                    if(tmpArea > area){
                        area = tmpArea;
                    }
                }
            }

            if(leftHeight <= rightHeight){
                left++;
            }
            else{
                right--;
            }
        }

        return  area;
    }
} 
