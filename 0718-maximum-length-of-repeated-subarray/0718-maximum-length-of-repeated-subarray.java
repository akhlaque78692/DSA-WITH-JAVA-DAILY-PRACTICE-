// class Solution {
//     public int findLength(int[] nums1, int[] nums2) {
        
//     }
// }
// class Solution {
//     public int (String s1, String s2) {
//         // code here
        
//     }
// }

 
class Solution {



     public int findLength (int[] s1, int [] s2) {


       int n=0;
       int m =0;
        n =  s1.length; 
        m =  s2.length;

       int dp[][]  =  new int [n+1][m+1]; 
       for(int i = 0 ; i<=n ; i++){
         dp[i][0]=0;
       }
       for(int j = 0 ; j<=m ; j++){
         dp[0][j]=0;
       }
      
                   int ans  = 0 ;
       for(int  i = 1;   i<=n ;  i++){

            for(int  j  = 1  ;  j<=m; j++){
                   if(s1[i-1]==s2[j-1]){
               dp[i][j] = 1+ dp[i-1][j-1];
                      ans  = Math.max(ans ,  dp[i][j]);
                    //   max = ans;
                   }
                   else{
                   dp[i][j]=  0 ;;

                   }
            }
       }


      return  ans ;

     }
 }