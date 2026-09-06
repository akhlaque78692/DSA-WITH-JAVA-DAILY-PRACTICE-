class Solution {
    public int maxSubArray(int[] nums) {
            int l = 1 ; 
            int currentSum = nums[0];
            int maxSum=nums[0];
     while(l<nums.length){
            currentSum =  Math.max(nums[l] ,  currentSum+nums[l]);
            maxSum = Math.max(maxSum , currentSum);
            l++;
     }
     return maxSum;
    }
}