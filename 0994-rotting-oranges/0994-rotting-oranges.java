// class Solution {
//     public int orangesRotting(int[][] grid) {
        
//     }
// }
class Solution {
  int tm =  0 ; 
   
    public int orangesRotting(int[][] grid) {
            
            Queue<List<Integer>> q =  new LinkedList<>();
           int check[][] =  new int[grid.length][grid[0].length];
           for(int i = 0 ; i<grid.length ;  i++){
               for(int  j = 0 ; j<grid[i].length  ; j++){
                   if(grid[i][j]==2){
                    List<Integer>   list =  new ArrayList<>();
                      check[i][j]=1;
                      list.add(i);
                      list.add(j);
                      list.add(0);
                      q.add(list);
                      
                   }
               }
           }

           fun(q, grid, check );
          
            for(int i = 0  ; i <grid.length  ;  i++){
                 for(int j = 0 ;  j<grid[i].length  ; j++){
                    if(grid[i][j]==1){
                       return -1;
                    }
                 }
            }
           return tm  ;   
    }
       void fun(Queue<List<Integer>> q , int [][]  grid  , int [][] check){       

                 
                
                //  Queue<List<Integer>> q  =  new LinkedList<>();
                //  q.add(list);
                 while(!q.isEmpty()){
                      List<Integer> temp  = new ArrayList<>();
                      temp =  q.remove();
                      tm  =  Math.max(tm,  temp.get(2));
                      int r  =  temp.get(0);
                      int c =  temp.get(1);
                      // int t =  temp.get(2);
                      int row[]   =  {0,0 ,-1, 1};
                      int col [] =  {-1,1, 0  , 0};
                      for(int  k = 0  ;  k <4  ; k++){
                           int nr  =  r+row[k];
                           int nc =  c +col[k];
                           if(nr>= 0  && nr<grid.length &&
                           nc >=0 && nc<grid[0].length && 
                           grid[nr][nc]==1 && check[nr][nc]!=1){
                                   grid[nr][nc]=2  ; 
                                   check[nr][nc]=1;
                                   List<Integer> ltemp =  new ArrayList<>();
                                   ltemp.add(nr);
                                   ltemp.add(nc);
                                   int t2  = temp.get(2);
                                   ltemp.add(t2+1);
                              
                                   q.add(ltemp);


                           }

                      }


                 }
       }
}
