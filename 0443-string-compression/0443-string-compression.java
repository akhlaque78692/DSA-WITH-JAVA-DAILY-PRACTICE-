class Solution {
    public int compress(char[] arr) {
             int  i = 0 ;
             int    j  = 0 ;
             int index  = 0 ;
              while(j<arr.length){
                    int count = 0 ;

                    while(j<arr.length && arr[j]==arr[i]){
                         count++;
                         j++;
                    }
                    arr[index] =  arr[i];
                    index++;
                    if(count>1){
                    String s  = String.valueOf(count);
                     for(int  k  = 0 ; k< s.length() ;  k++){
                               arr[index] = s.charAt(k);
                               index++;
                     }

                    }
                      if(j<arr.length){
i = j ;
                      }
                      
              }
                   
              return index;
              
    }
}