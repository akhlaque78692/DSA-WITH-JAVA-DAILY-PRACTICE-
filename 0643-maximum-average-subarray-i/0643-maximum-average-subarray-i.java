class Solution {
    public double findMaxAverage(int[] nums, int k) {
             double  max = 0  ; 
             int r  = k-1; 
             int  l = 0 ;
             int sum = 0 ; 
             for( int  i = 0  ; i<=r ;i++){
                 sum+=nums[i];
             }
             max =sum;
              

             while(r<nums.length-1){
                double kk  =  (double)sum/k;
               
                sum  =  sum -nums[l]+nums[r+1];
                l++;
                r++;

                 max=  Math.max(max  , sum);

             }
             return (double)max/k;

    }
}