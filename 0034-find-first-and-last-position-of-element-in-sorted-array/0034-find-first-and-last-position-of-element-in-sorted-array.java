class Solution {
    public int[] searchRange(int[] nums, int target) {
            int arr[] =  {-1, -1};
            int  i = 0 ; 
            int i1 = 0;
            int j1 =  nums.length-1;
            int  j = nums.length-1;
            // for celling index; 
            while(i<=j){
                  int mid=  i+(j-i)/2;
                  if(target==nums[mid]){
                        arr[0]= mid;
                        j =  mid-1;

                  }
                 else if(target>nums[mid]){
                      i =  mid+1;
                  }
                  else{
                       j =  mid-1;
                  }


            }
            while(i1<=j1){
                  int mid  =  i1+(j1-i1)/2;
                  if(target==nums[mid]){
                        arr[1]= mid;
                        i1 =  mid+1;

                  }
                 else if(target>nums[mid]){
                      i1 =  mid+1;
                  }
                  else{
                       j1 =  mid-1;
                  }


            }
            return arr;
    }
}