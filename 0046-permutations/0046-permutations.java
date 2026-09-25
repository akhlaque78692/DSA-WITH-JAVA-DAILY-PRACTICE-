class Solution {

     

          void pm( int  arr[] , List<List<Integer>> ans ,List<Integer> list, int check[] ){

                   if(list.size() == arr.length){
                       ans.add(new ArrayList<>(list));
                       return;
                   }
                   

                   for(int  i = 0; i<  arr.length;  i++){
                            if(check[i]!=1){
                                check[i]=1;
                                list.add(arr[i]);
                                pm( arr, ans , list ,  check);
                                list.remove(list.size()-1);
                                check[i]=0;
                            }
                   }


          }
    public List<List<Integer>> permute(int[] nums) {
                    List<List<Integer>> ans  =  new ArrayList<>();
              
                     List<Integer> list   =  new ArrayList<>();
                    int check[] =   new int[nums.length];
                    pm( nums, ans , list ,  check);
              
              return ans;
    }
}