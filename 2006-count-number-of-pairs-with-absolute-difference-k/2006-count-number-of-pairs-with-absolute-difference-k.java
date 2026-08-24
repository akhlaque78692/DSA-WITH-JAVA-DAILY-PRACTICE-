class Solution {
    public int countKDifference(int[] nums, int k) {
        int c = 0;
        Arrays.sort(nums);
         for(int i = 0  ; i < nums.length-1 ; i++){
                for(int j  = i+1; j<nums.length ; j++ ){
                    if(nums[j]-nums[i]==k){
                        c++;
                    }
                }
         }
         return c;
    }
}