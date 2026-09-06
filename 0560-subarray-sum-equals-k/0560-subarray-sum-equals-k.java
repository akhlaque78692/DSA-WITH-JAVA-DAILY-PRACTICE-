class Solution {
    public int subarraySum(int[] nums, int k) {
             int prefixsum[] =  new int[nums.length];
             prefixsum[0]=nums[0];
             for(int i  = 1  ; i <nums.length ; i++){
                //    sum    =  sum+prefix[i-];
                          prefixsum[i]=nums[i]+prefixsum[i-1];

             }
             HashMap<Integer , Integer>  map = new HashMap<>();
            int count  = 0 ;
            map.put(0 ,  1);
         for(int n :  prefixsum){
                if(map.containsKey(n-k)){
                     count += map.get(n-k);
                     
                } 
                map.put(n ,  map.getOrDefault(n, 0)+1);

         }
         return count;
    }
}