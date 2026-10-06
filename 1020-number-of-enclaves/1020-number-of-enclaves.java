
class Solution {
    public int numEnclaves(int[][] grid) {
         int  arr[][] =  new int[grid.length][grid[0].length];
         Queue<List<Integer>>  q =  new LinkedList<>();
         for(int i  = 0 ;  i<grid.length  ; i++){
              
                 if(grid[i][0]==1){
                     arr[i][0]=1;
             List<Integer>  list  =  new ArrayList<>();
             list.add(i);
             list.add(0);
             q.add(list);
                 }
                   if(grid[i][grid[0].length-1]==1){
                       arr[i][grid[0].length-1]=1;
             List<Integer>  list  =  new ArrayList<>();
             list.add(i);
             list.add(grid[0].length-1);
             q.add(list);
                 }
         }
         
         for(int i  = 0 ;  i<grid[0].length  ; i++){
              
                 if(grid[0][i]==1){
                     arr[0][i]=1;
             List<Integer>  list  =  new ArrayList<>();
             list.add(0);
             list.add(i);
             q.add(list);
                 }
                   if(grid[grid.length-1][i]==1){
                       arr[grid.length-1][i]=1;
             List<Integer>  list  =  new ArrayList<>();
             list.add(grid.length-1);
             list.add(i);
             q.add(list);
                 }
         }
         
         
         while(!q.isEmpty()){
              
              
              List<Integer> temp   =  q.remove();
              int row  =  temp.get(0);
              int col   = temp.get(1);
              int r[] =  {-1,1 ,0, 0};
              int c[] =  {0 , 0 ,-1,1};
              for(int  i  = 0 ;   i<4 ;  i++){
                       int nr  =  row+r[i];
                       int nc  =  col+c[i];
    if(nr>=0  && nc>=0  && nr<grid.length && nc<grid[0].length  && 
    arr[nr][nc]!=1 && grid[nr][nc]==1){
                arr[nr][nc]=1;
                List<Integer>  l =  new ArrayList<>();
                l.add(nr);
                l.add(nc);
                q.add(l);
    }                
              }
         }
         int count = 0 ;
         
         for(int  i   = 0   ;i<grid.length ;  i++){
               for(int j  =    0 ; j<  grid[0].length ;  j++){
                      if(arr[i][j]!=1 && grid[i][j]==1){
                            count++;
                      }
               }
         }
         
         return count;
         
    }
};