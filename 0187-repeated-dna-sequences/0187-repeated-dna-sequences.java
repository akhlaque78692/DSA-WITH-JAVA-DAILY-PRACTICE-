class Solution {
    // HashSet<String>  set  =  new HashSet<>();
    HashMap<String , Integer> map  = new HashMap<>();
    public List<String> findRepeatedDnaSequences(String s) {
         List<String> list  =  new ArrayList<>();
         int count = 0 ;
               for(int  i   = 0  ;  i<s.length() ; i++){
                    String str = "";
                    int n  =  10+i;
                    
                        if(n<=s.length()){
                    
                         str = s.substring(i ,  n);
                        }
                      
                    
                    
                    if(!str.equals("") && map.containsKey(str) ){
                          if(map.get(str)<2){
                            list.add(str);

                          }
                    }
                  map.put(str, map.getOrDefault(str, 0)+1);
                                            
                    
                   
               }
               return list;
    }
}