class RandomizedSet {
        List<Integer> mySet = new ArrayList<>();

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(!mySet.contains(new Integer(val))){
            
            mySet.add(new Integer(val));
            return true;
        }
        return false;
        
    }
    
    public boolean remove(int val) {
        if(mySet.contains(new Integer(val))){
            
            mySet.remove(new Integer(val));
            return true;
        }
        return false;
        
    }
    
    public int getRandom() {
        
        int random = (int ) (Math.random()* mySet.size());
        
        return mySet.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */