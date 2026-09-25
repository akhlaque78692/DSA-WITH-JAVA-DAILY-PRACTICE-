class Solution {

      int dp[][] ;

        // int f(List<List<Integer>> t, int row, int col){
        //          if(row==t.size()-1){
                          
        //                 return  t.get(row).get(col);
        //          }
        //          if(dp[row][col]!=null){
        //             return dp[row][col];
        //          }
                 
        //         int oneWay=  t.get(row).get(col)+f(t,row+1, col);
        //         int second =  t.get(row).get(col)+f(t,row+1,col+1);
        //         dp[row][col] = Math.min(oneWay , second);
        //     return dp[row][col] ;
        // }
    public int minimumTotal(List<List<Integer>> t) {
             dp=  new int[t.size()][t.size()];
            //     //   int row  =  0;
            //     //   int col= 0 ;
            //     //   return f(t , row, col);
              int  n  =  t.size();
              for(int  i = 0  ; i < n ; i++){
                    dp[n-1][i]=t.get(n-1).get(i);
              }

              for(int  row  = n-2 ; row>=0 ; row--){
                   for(int col = 0 ;  col<=row ; col++){
                        int l = t.get(row).get(col)+dp[row+1][col];
                        int r = t.get(row).get(col)+dp[row+1][col+1];
                        dp[row][col] = Math.min(l,r);
                   }
              }
return dp[0][0];
 
    }
}