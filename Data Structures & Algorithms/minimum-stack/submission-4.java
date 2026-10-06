class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    public MinStack() {
        s=new Stack<>();
        minStack=new Stack<>();

        
    }
    
    public void push(int val) {
        s.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            minStack.push(Math.min(val,minStack.peek()));
        }
        
    }
    
    public void pop() {
        s.pop();
        minStack.pop();
        
    }
    
    public int top() {
        return s.peek();
       
        
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
}
