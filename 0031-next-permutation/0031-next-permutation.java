
class Solution {
         void reverse(int nums[] , int newIndex , int endIndex){
                while(newIndex<=endIndex){
                int temp   =  nums[newIndex];
                nums[newIndex] =  nums[endIndex];
                nums[endIndex]= temp ;
                endIndex--;
                newIndex++;
            }
         }
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
            reverse( nums , i , j);
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
              reverse( nums ,  newIndex , endIndex);
             
         
             
    }
    }
}