class Solution {
    public int findMiddleIndex(int[] nums) {
        int left = 0;
        int right = 0;
        
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        
        if (right == left) return 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            right -= nums[i + 1];
            if (right == left) return i + 1;
        }
        return -1;
    }
}