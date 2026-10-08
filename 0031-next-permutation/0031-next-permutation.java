
class Solution {
       
    public void nextPermutation(int[] nums) {
        int index  = -  1;
         for(int   i = nums.length-2 ; i>=0 ;  i--){
                 if(nums[i]<nums[i+1]){
                       index   = i;
                       break ; 
                 }
         }
         if(index==-1){
            int i  = 0 ;
            int j  =  nums.length -1;
            while(i<=j){
                int temp   =  nums[i];
                nums[i] =  nums[j];
                nums[j]= temp ;
                i++;
                j--;
            }
         }
         else{
            for(int k  =  nums.length-1 ; k>=index ; k--){
                     if(nums[k]>nums[index]){
                         int temp  =  nums[k];
                         nums[k] =  nums[index];
                         nums[index]=temp;
                         break;
                     }
            }
              int newIndex  =  index+1;
              int endIndex =   nums.length-1;
             while(newIndex<=endIndex){
                int temp   =  nums[newIndex];
                nums[newIndex] =  nums[endIndex];
                nums[endIndex]= temp ;
                endIndex--;
                newIndex++;
            }
         }
             
    }
}