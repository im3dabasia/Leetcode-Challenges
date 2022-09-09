class MinStack {
    List<Integer> list;
    List<Integer> minlist;
    public MinStack() {
        list=new ArrayList();
        minlist=new ArrayList();
        minlist.add(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        list.add(val);
        if(minlist.get(minlist.size()-1)>val)
            minlist.add(val);
        else
            minlist.add(minlist.get(minlist.size()-1));
    }
    
    public void pop() {
        list.remove(list.size()-1);
        minlist.remove(minlist.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return minlist.get(minlist.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */