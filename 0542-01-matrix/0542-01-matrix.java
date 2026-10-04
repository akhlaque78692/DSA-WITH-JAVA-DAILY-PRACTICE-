class Solution {

    public int[][] updateMatrix(int[][] mat) {

        int arr[][] = new int[mat.length][mat[0].length];
        int visited[][] =  new int[mat.length][mat[0].length];
        
        Queue<List>  q =  new LinkedList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                if (mat[i][j] == 0) {
                    List<Integer>   list  =  new ArrayList<>();
                    list.add(i);
                    list.add(j) ; 
                    list.add(0);
                    q.add(list);
                    visited[i][j]=1;

                } 
            }

        }

        while(!q.isEmpty()){

            List<Integer> temp =  q.remove();
            int[] rowDir = {0, 0, -1, 1};
            int[] colDir = {-1, 1, 0, 0};
            int row  =  temp.get(0);
            int col  =  temp.get(1);
            int steps =  temp.get(2);
            arr[row][col]=steps;
            for(int  k  =  0 ;   k< 4 ;  k++){
                   int nr  =  row+rowDir[k] ;
                   int nc =  col +  colDir[k];


        if (nr >=0 && nr < mat.length &&
            nc>=0 && nc< mat[0].length 
            && visited[nr][nc]==0) {
                 visited[nr][nc]=1;
                 List<Integer>   list  =  new ArrayList<>();
                 list.add(nr);
                 list.add(nc);
                 list.add(steps+1);
                 q.add(list);
        }



            }//for
        }

        return arr;
    }

    
}