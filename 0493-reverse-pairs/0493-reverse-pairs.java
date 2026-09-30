class Solution {
      int count ;
    public int reversePairs(int[] nums) {
        count  = 0 ;
        int l  =  0 ; 
        int r = nums.length-1;
        int  arr[]  = new int[r+1];
        for(int  i  = 0 ; i <=r ; i++){
            arr[i]=nums[i];
        }
     countnumber(arr, l , r );
      return count;

    }

    void countnumber(int []arr, int l  , int r ){
           if(l>=r){
            return ;
           }
           int mid  =  l+(r-l)/2;
           countnumber(arr, l , mid);
           countnumber(arr, mid+1 , r);
           int temp[] = new int[r-l+1];
         int left  =  l ;
         int right  =  mid+1;
         int  i = 0 ;

         int j = right;

          for(int  s = l ; s<=mid   ;  s++){
               while(j<=r && arr[s]> 2L*arr[j]){
                      j++;
               }
               count+= j-(mid+1);
          }

         while(left<=mid && right<=r){
                
               if(arr[left]>arr[right]){
                    
                    
                    temp[i]=arr[right];          
                    right++;
               }
               else{
                  
                  temp[i]=arr[left];
                  left++;
               }
               i++;
         }
         while(left<=mid){
              
              temp[i]=arr[left];
              left++;
              i++;
         }
         while(right<=r){
            temp[i]=arr[right];
            right++;
            i++;

         }
         for(int  k  = 0 ; k<temp.length ; k++){
               arr[l+k]=temp[k];
         }

    }
}