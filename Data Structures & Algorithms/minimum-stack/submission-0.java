class MinStack {
    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        int rem = stack.pop();
        if(rem == min){
            int x = getMin();
        }
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        
        for(int s:stack){
            if(s < min){
                min = s;
            }
            
        }
        return min;
    
    }
}
