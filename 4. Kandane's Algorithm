class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)    return nums[0];
        int sum = nums[0];
        int max_sum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(sum>0)
                sum = sum+nums[i];
            else
                sum = nums[i];
            if(max_sum<sum)
                max_sum = sum;
        }
        return max_sum;
    }
}
