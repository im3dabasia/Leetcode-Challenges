class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        
        for(int[] edge: edges){
            
            int start = edge[0];
            int end = edge[1];
            
            map.putIfAbsent(start, new ArrayList<>());
            map.get(start).add(end);
            
            // since it is bidirectional
            map.putIfAbsent(end, new ArrayList<>());
            map.get(end).add(start);
            
            
            
        }
        
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        
        visited.add(source);
        
        while(!queue.isEmpty()){
            
            int currNode = queue.poll();
            
            if(currNode == destination )return true;
            
            List<Integer> ls= map.get(currNode);
            
            for(int val: ls){
                if(!visited.contains(val)){
                    queue.add(val);
                    visited.add(val);
                }
            }
        }
        return false;
        
    }
}