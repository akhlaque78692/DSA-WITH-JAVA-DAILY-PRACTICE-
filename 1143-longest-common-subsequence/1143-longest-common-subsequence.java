
class Solution {
    int dp[][];
    public int longestCommonSubsequence(String s1, String s2) {
          int n =  s1.length();
          int m  =  s2.length();
         dp =  new int [s1.length()+1][s2.length()+1];
         for(int  i  = 0 ;   i<=n  ;  i++){
               dp[i][0]=0;
         }
          for(int  i  = 0 ;   i<=m  ;  i++){
               dp[0][i]=0;
         }
        for(int  i = 1 ; i <=n  ; i++){
               for(int  j  = 1;  j<=m  ; j++){
                     if(s1.charAt(i-1)==s2.charAt(j-1)){
                     dp[i][j] =  1 + dp[i-1][j-1];
                     }
               
               else{
                  dp[i][j]= Math.max(dp[i] [j-1], dp[i-1] [j]);
               }
                     }
               
        }
        return dp[n][m];
    }
    
}





//      for(int  i =  0 ;  i<s1.length() ; i++){
    //             for(int  j = 0 ;  j<s2.length() ; j++){
    //                   dp[i][j]=-1;
    //             }
    //      }
    //      return   lcs2(s1, s2 , s1.length()-1 , s2.length()-1);
        
    // }
    //    int lcs2(String s1, String s2,  int i , int j ){
    //            if(i<0 || j< 0 ){
    //                return  0 ; 
    //            }
    //            if(dp[i][j]!=-1){
    //                  return dp[i][j];
    //            }
    //            if(s1.charAt(i)==s2.charAt(j)){
    //                  dp[i][j] =  1 + lcs2(s1, s2, i-1, j-1);
    //                  return dp[i][j];
    //            }
    //            dp[i][j]= Math.max(lcs2(s1, s2, i , j-1), lcs2(s1, s2,i-1 , j));
    //            return dp[i][j];