class Solution {
    Integer dp[][];
    public int f(int[][] m ,int row, int col ,int n) {


        if(col<0 || col >n-1){
              return (int)1e9;
          }
          if(row==n-1){
              
              return m[row][col]; 

          }
          if(dp[row][col]!=null){
              return dp[row][col];
          }
          

          int one  =  m[row][col]+f(m, row+1 ,  col-1,n);
          int second = m[row][col]+f(m,row+1 , col,n);
          int third=  m[row][col]+f(m,row+1 ,col+1, n);
           dp[row][col]=Math.min (third , Math.min(one, second));

           return dp[row][col];

    }
   public int minFallingPathSum(int[][] m) {
       
  int n  =  m.length;
   int min  =  Integer.MAX_VALUE;
   dp  =  new Integer[n][n];

        for(int col   = 0 ; col <m.length ; col++){
             min=    Math.min(min ,f(m, 0, col,n));
        }
       return min;

}
}