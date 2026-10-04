class Solution {


      public int maxConsecutiveAnswers(String s, int k){
                return  Math.max(max(s, k , 'F') , max(s,k,'T'));        
      }
    public int max(String s, int k ,  char c) {
        int ans  =  0;
        int count  = 0 ; 
        int  i   =  0 ; 
        int  j  =  0;
         while(j<s.length()){
            if(s.charAt(j)==c){
                 count++;  
            }
            
            
            while(count>k){
                   if(s.charAt(j)==s.charAt(i)){
                    count--;
                   }
                   i++;

                   

            }
            
            ans  =  Math.max(ans ,  j-i+1);
            j++;
         }
         return ans ;
    }
}