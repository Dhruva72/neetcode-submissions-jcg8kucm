class MinStack {
    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;
    Stack<Integer> minstack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(  minstack.isEmpty()  || val <= minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        int rem = stack.pop();
        if(rem == minstack.peek()){
            minstack.pop();
        }

    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        
        return minstack.peek();
    
    }
}
