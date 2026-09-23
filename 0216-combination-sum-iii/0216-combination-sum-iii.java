class Solution {

    
    List<List<Integer>> ans  =  new ArrayList<>();
    List<Integer> list =  new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
         int s = 0;
         int count = 0;
         com( k ,   n ,s,1 , count);
         return ans;    
    }


     void com(int k ,  int n , int s , int index , int count){
            if(count>n ||  s>n){
                return ;
            }
            if(k==count && s==n){
                  
                
                ans.add(new ArrayList<>(list));
                return ;
             
            }
            for(int  i = index  ; i<=9; i++ ){
                  list.add(i);
                  count++;
                  com(k, n , s+i ,i+1 ,count);
                 
                  list.remove(list.size()-1);
                  count--;
                   
            }
     }
}