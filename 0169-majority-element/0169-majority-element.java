class Solution {
    public int majorityElement(int[] nums) {
             HashMap<Integer , Integer>  count  =  new HashMap<>();
             for(int n :  nums){
                  count.put(n , count.getOrDefault(n , 0)+1);
             }
             for(int n :  nums){
                if(count.get(n)>(nums.length/2)){
                      return n;
                }
             }
             return -1;
    }

}