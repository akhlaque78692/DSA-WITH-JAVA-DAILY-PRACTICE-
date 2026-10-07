class Solution {
    public int maxProfit(int[] arr) {
          int min  = 0 ;
          int max =  Integer.MIN_VALUE;
        //   HashSet<Integer>  set  =  new Hahset<>();\
           Stack<Integer>  stack  = new Stack();
           for(int i = 0 ;   i < arr.length  ; i++  ){
                 min  =arr[i];
                  if(stack.isEmpty() || stack.peek()>arr[i]){
                         stack.push(arr[i]);
                  }
                  else{
                       max  =  Math.max(max, arr[i]-stack.peek());
                  }
           }
           if(max<0){
             return 0;
           }
           return max;
    }
}