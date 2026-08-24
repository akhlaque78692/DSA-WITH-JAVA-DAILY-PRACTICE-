class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
    int j  = 0 ; 
   int count=0;
    int r = people.length-1;
    while(j<=r){
           if(people[j]+people[r]<=limit)
           {
            count++;

            j++;
            r--;
           }
           else if(people[j]+people[r]>limit){
                r--;
                count++;
           }
           else{
            j++;
           }
    } //w
    return count;
    }
}