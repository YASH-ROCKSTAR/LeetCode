class MinStack {
    Stack<Integer> all;
    Stack<Integer> mind;
    public MinStack() {
        all=new Stack<>();
        mind=new Stack<>();
    }
    
    public void push(int val) {
        all.push(val);
        
        if(mind.size()==0 || val<=mind.peek()){
            mind.push(val);
        }
    }
    
    public void pop() {
        if(all.size()==0){
            return;
        }
        else{
            int val=all.pop();
            if(val==mind.peek()){
                mind.pop();
            }
        }
    }
    
    public int top() {
        if(all.size()==0){
            return -1;
        }
        else{
            return all.peek();
        }
    }
    
    public int getMin() {
        if(all.size()==0){
            return -1;
        }
        else{
            return mind.peek();
        }
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