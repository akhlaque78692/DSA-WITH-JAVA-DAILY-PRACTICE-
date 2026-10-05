class Solution {
    public void sortColors(int[] arr) {
         int low  = 0; 
        int mid  = 0 ;
        int high =  arr.length-1;
        while(mid<=high){
              if(arr[mid]==1){
                 mid++;
              }
             else if (arr[mid]==0){
                     swap(mid  ,  low ,  arr);
                     low++;
                     mid++;
             }
            else{
                   swap(mid, high , arr);
                    high--;
            }
        }
    
}
// Online Java Compiler (Editor)
// Write and run Java online using this editor.


    void swap(int index1 , int index2,  int []arr){
           int temp   =  arr[index1];
        arr[index1]= arr[index2];
          arr[index2]=temp;
    }
    
       
       
    
}