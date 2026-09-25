class Solution {



          void dfs(int[][] arr ,int node,int[] check){
                   check[node]=1;
                  for(int  i = 0 ; i<arr.length ; i++){
                       if(arr[node][i]==1 && check[i]!=1){
                           dfs(arr, i ,  check);
                       }
                  }

          }
    public int findCircleNum(int[][] arr) {
             int check[] = new int [arr.length+1];
             int count= 0 ;
             for(int i = 0 ; i < arr.length ; i++){
                   
                   if(check[i]!=1){
                    count++;
                        dfs(  arr ,i,  check);
                          
                   }
             }
             return count;
    }
}