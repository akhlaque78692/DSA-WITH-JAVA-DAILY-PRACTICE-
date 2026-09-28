


class Solution {
    
      int dp[][] ;
       int sumCheck(int arr[] , int sum,int n ,int t ){
            if(sum==t){
                 return 1;
            }
            
            if(n<0){
                return 0;
            }
            if(sum>t){
                return 0 ; 
            }
            if(dp[n][sum]!=-1){
                  return dp[n][sum];
            }
            
            int p  = sumCheck(arr, sum+arr[n], n-1 , t);
            int np  =  sumCheck(arr , sum, n-1, t);
             if(p==1 || np==1){
                              dp[n][sum]=1;
             
             }else{
                 dp[n][sum]=0;
             }

             
             
             
            return dp[n][sum] ; 
       }
    public  boolean canPartition(int arr[]) {
         
         int  target  = 0;
          for(int  n :  arr){
              target +=n;
          }
          if(target%2!=0){
              return false ;
          }
          int t  =  target/2;
           dp= new int[arr.length][t+1];
          for (int i = 0; i < arr.length; i++) {
                      for (int j = 0; j <= t; j++) {
                          dp[i][j] = -1;
                      }
                  }

          
          
          
          int sum = 0 ;
         int tt=    sumCheck(arr, sum , arr.length-1 ,t);
         return tt==1;
           
           
        
    }
}