class Solution {
    public void moveZeroes(int[] nums) {
             int  i  = 0 ;
             int  j  =  1; 
             while(j<nums.length){
                     
                     if(nums[j]!=0){
                         while(nums[i]!=0 && i<j){
                             i++;  
                         } 
                        

                        
                         int k  = nums[j];
                         nums[j] =  nums[i];
                         nums[i]=k;
                        
                        
                       
                     }
                     j++;
                  
             }
    }
}