class Solution {
    public int[] leftRightDifference(int[] nums) {
        int right = 0;
        int left = 0;
        
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            int temp1 = nums[i];
            int temp2 = nums[i + 1];
            nums[i] = Math.abs(left - right);
            left += temp1;
            right -= temp2;
        }
        nums[nums.length - 1] = left;
        return nums;
    }
}