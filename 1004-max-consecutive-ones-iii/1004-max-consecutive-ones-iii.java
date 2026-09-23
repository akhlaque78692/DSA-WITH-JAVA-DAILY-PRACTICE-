class Solution {
    public int longestOnes(int[] arr, int k) {
           int  i = 0 ;
           int  j = 0 ;
           int zero = 0;
           int max =  Integer.MIN_VALUE;
           while(j<arr.length){
                if(arr[j]==0){
                    zero++;
                }
              while(zero>k){
                   if(arr[i]==0){
                    zero--;
                   }
                   i++;
              }
              max  =  Math.max(max , j-i+1);
              j++;
            
           }
           return max;
    }
}