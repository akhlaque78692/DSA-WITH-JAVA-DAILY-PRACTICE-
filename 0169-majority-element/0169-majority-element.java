class Solution {

    public int majorityElement(int[] nums) {
            //  HashMap<Integer , Integer>  count  =  new HashMap<>();
            int count =   0 ;
            int el  = 0 ;
            for(int  i  = 0  ;  i<nums.length  ;  i++){
                   if(count==0){
                       el  =  nums[i];
                       count++;
                   }
                   else if(el==nums[i]){
                       count++;
                   }
                   else{
                      count--;
                   }
            }
            

            if(count!=0){
                 return el;
            }
         
        
          return -1;
    }
}