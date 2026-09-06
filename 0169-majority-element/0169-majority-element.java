class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer>  map =  new HashMap<>();
          for(int a  :  nums){
               if(map.containsKey(a)){
                    map.put(a, map.get(a)+1);
               }
               else{
                  map.put(a, 1);
               }
               
    }   
    int ans = 0 ;
    int max = Integer.MIN_VALUE ; 
     for(int  i  :  nums){
            if(max < map.get(i)){
                 max  =  map.get(i);
                  ans  =  i;
            }
            
     }
    return ans ;
    }
}