class Solution {

      Integer dp[][] ;

        int f(List<List<Integer>> t, int row, int col){
                 if(row==t.size()-1){
                          
                        return  t.get(row).get(col);
                 }
                 if(dp[row][col]!=null){
                    return dp[row][col];
                 }
                 
                int oneWay=  t.get(row).get(col)+f(t,row+1, col);
                int second =  t.get(row).get(col)+f(t,row+1,col+1);
                dp[row][col] = Math.min(oneWay , second);
            return dp[row][col] ;
        }
    public int minimumTotal(List<List<Integer>> t) {
             dp=  new Integer[t.size()][t.size()];
                  int row  =  0;
                  int col= 0 ;
                  return f(t , row, col);

 
    }
}