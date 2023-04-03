class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int low = 0;
        int high = people.length -1;
        
        int res = 0;
        // System.out.println(Arrays.toString(people));
        
        while(low <= high){
            
            int cnt = 0;
            int currPerson = people[high--];
            // System.out.println("Curr P: " + currPerson);
            cnt++;
            
            if( currPerson < limit){
                
                if(people[low] <= limit - currPerson){
                    // System.out.println("i can take one more P: " + people[low]);
                    
                    low++;
                    // cnt++;
                }
            }
            // System.out.println(cnt);
            res += cnt;
            // System.out.println("Res: "+ res);
        }
        return res;
    }
}