class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
       List<List<List<Integer>>>   adj   =  new ArrayList<>();
       PriorityQueue<List<Integer>>  pq =  new PriorityQueue<>((a, b)->Integer.compare(a.get(0) ,  b.get(0)));
        List<Integer>  list1  =  new ArrayList<>();
        list1.add(0);
        list1.add(k);

        pq.add(list1);
        for(int i  = 0;  i<=n  ; i++){
              adj.add(new ArrayList<List<Integer>>());
        }
        for(int [] arr :  times){
               int time  =  arr[2];
               int u   =  arr[0 ];
               int v =  arr[1];
               List<Integer> temp  =  new ArrayList<>();
               temp.add(time);
               temp.add(v);
               adj.get(u).add(temp);
               
        }
    
     int t[] =  new int[n+1];
        Arrays.fill(t ,  (int)1e9);
        t[k] =  0;
        while(!pq.isEmpty()){
                List<Integer> temp  =  pq.remove();
                int time1   =  temp.get(0);
                int node  =  temp.get(1);
                for(List<Integer>   l :  adj.get(node)){
                            // l  =  adjList.get(node);
                            int newNode  =  l.get(1);

                            int time2 =  l.get(0);
                            if(time1+time2>=t[newNode]){
                                continue;
                            }

                            List<Integer> ll =  new ArrayList<>();
                            t[newNode]=time1+time2;
                            ll.add(time1+time2);
                            ll.add(newNode);
                            pq.add(ll);
                }

        }




       int ans = 0 ;
       for(int  i =   1 ;  i<=n ; i++){
             if(t[i]==(int)1e9){
                return -1;
             }
               ans= Math.max(ans  ,  t[i]);
       }
    return ans;
       
    }
}