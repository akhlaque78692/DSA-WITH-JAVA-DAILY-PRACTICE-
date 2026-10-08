
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0;
        int count2  =  0 ;
        int el1 = 0;
        int el2 =  0; 
        List<Integer>  list =  new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
              if (el1 == nums[i]) {
    count1++;
}
else if (el2 == nums[i]) {
    count2++;
}
           else  if (count1 == 0) {
                // list.add(el)
                el1 = nums[i];
                count1++;
            }
            else if(count2==0){
           el2 = nums[i];
           count2++;
            }
            
            else  {
                count2--;
                count1--;
            }
        }
        int c1 = 0;
        int c2  = 0;
       for(int n  : nums ){
            if(el1==n){
               c1++;
            }
            else if(el2==n){
                  c2++;
            }
       }
       if(c1>nums.length/3){
        list.add(el1);
       }
       if(c2>nums.length/3){
        list.add(el2);
       }
       return list;
    }
}