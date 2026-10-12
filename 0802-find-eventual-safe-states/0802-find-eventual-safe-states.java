class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
              int n  =  graph.length;
              List<Integer>  list  =  new ArrayList<>();
              List<List<Integer>> adj  =  new ArrayList<>();
              for(int  i  = 0 ;   i< n ;  i++){
                 adj.add(new ArrayList<>());
              }
              
              for(int i  = 0    ;   i < n ;  i++){
                      for(int  j  :   graph[i]){
                         adj.get(i).add(j);
                      }
                  
              }
            
            int arr[] =  new int[n];
            Arrays.fill(arr, -1);
            
            for(int i = 0 ;   i <  n  ;  i++){
                // Stack<Integer>  stack  =  new Stack<>();
                
                    // arr[i]==1;
                   if(dfs(adj , arr,  i)){
                       list.add(i);
                   };
                
            }
             return list;
            
    }


    boolean dfs(List<List<Integer>>   adj ,  int[]  arr,  int index){
             if(arr[index]!=-1){
                   return arr[index]==2;
                          }             
                   
             arr[index] = 1;

              for(int  n  :  adj.get(index) ){
                    
                       if(!dfs(adj, arr, n)){
                          return false ;
                       }
                    
              }
               arr[index]=2;
               return true ;
            
    }
}