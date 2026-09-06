class Solution {
    public int maxSubArray(int[] nums) {
           int  max = nums[0];
           int sum = nums[0]; 
           int  i = 0;
           int  l = 1 ;

          while(l<nums.length){
                    sum = Math.max(nums[l] , sum+nums[l]);
                    max = Math.max(max, sum);
                    l++;
          }
          return max;
    }
}