class Solution {
     
         List<List<Integer>>   ans  =  new ArrayList<>();
         List<Integer>  list  =  new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] can, int tar) {
        
        int s  = 0;
        Arrays.sort(can);
        sum(can, 0 , tar,s);
        return ans;
             
    }



    void sum (int can[] ,  int i , int tar ,  int s){



            


        if(s==tar){
                 ans.add(new  ArrayList<>(list));
                 return;
             }
        if(i >  can.length -1|| s>tar){
              return;
        }
        // if( i< can.length-1  && can[i]==can[i+1] ){
        //       return ;
        // }
        //   if(can[i]==can[i+1] && i<can.length){
        //         return;
        //   }
           
             
             for(int  ii = i ;  ii < can.length ; ii++){
                  
                  if(ii>i  && can[ii]==can[ii-1]){
                          continue ;
                  }
                  
                      
                          list.add(can[ii]);
                  sum(can , ii+1 , tar ,s+can[ii]);
                
                  list.remove(list.size()-1);
             }
        
            // sum(can , i+1, tar ,s+can[i]);
            // list.remove(list.size()-1);
            // sum(can , i+1 , tar ,s);
            
            
    }
}