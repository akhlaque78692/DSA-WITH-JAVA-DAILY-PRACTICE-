class Solution {
    public int minSubArrayLen(int target, int[] arr) {
             int j = 0 ;
             int  i = 0 ;
             int sum  = 0 ;
             int min  =  Integer.MAX_VALUE;

             while(j<arr.length ){
                     sum+=arr[j];
                     while(sum>=target){
                        min =  Math.min(min , j-i+1);
                            sum -=arr[i];
                            i++;
                     }
                     j++;
                     
             }
             return min==Integer.MAX_VALUE ? 0:min;
    }
}