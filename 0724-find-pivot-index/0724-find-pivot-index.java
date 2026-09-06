class Solution {
    public int pivotIndex(int[] nums) {
    int prefix[] = new  int[nums.length];   
    int postfix[] = new   int[nums.length];  
    prefix[0] =0;
    for(int  i = 1; i < nums.length ; i++){
             prefix[i] = prefix[i-1]+nums[i-1];

    }  
    postfix[nums.length-1]=0;
      for(int i = nums.length-2 ; i>=0 ; i--){
            postfix[i]=postfix[i+1]+nums[i+1];
      }
     for(int  i  = 0 ; i <nums.length ; i++ ){
          if(prefix[i]==postfix[i]){
            return i;
          }
     }
    
    return -1;
}
}