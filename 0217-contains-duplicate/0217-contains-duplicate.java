class Solution {
    public boolean containsDuplicate(int[] nums) {
        //    Arrays.sort(nums);
        HashSet<Integer> set  =  new HashSet<>();
        for(int n :  nums){
               if(set.contains(n)){
                return true ;
               }
               set.add(n);
        }
        return false;
    }
}