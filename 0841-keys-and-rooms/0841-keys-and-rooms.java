class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        
        if(n == 0 )  return true;
        HashSet<Integer> mySet = new HashSet<>();
        Queue<Integer> myQueue = new LinkedList<>();
        
        int cnt = 0;
        mySet.add(0);
        myQueue.add(0);
        
        for(int i = 0 ; i < rooms.get(0).size(); i++){
            if(!mySet.contains(rooms.get(0).get(i))){

                mySet.add(rooms.get(0).get(i));
                myQueue.add(rooms.get(0).get(i));
                cnt++;
            }
        }
        
        
        while(!myQueue.isEmpty()){
            
            int roomToExplore = myQueue.poll();
            System.out.println(roomToExplore);
            
            for(int i = 0; i < rooms.get(roomToExplore).size(); i++){
            
                if(!mySet.contains(rooms.get(roomToExplore).get(i))){
                
                    mySet.add(rooms.get(roomToExplore).get(i));
                    myQueue.add(rooms.get(roomToExplore).get(i));
                    
                    // System.out.println(rooms.get(roomToExplore).get(i));
                    cnt++;
                } 
    
            }
        }
        
        System.out.println(mySet.size());
        
        return (mySet.size() )== rooms.size();
    }
}