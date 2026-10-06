class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch = tokens[i];
            if(ch.equals("+")){
                s.push(s.pop()+s.pop());
            }else if(ch.equals("-")){
               int val1=s.pop();
               int val2=s.pop();
               s.push(val2-val1);
            }else if(ch.equals("*")){
                s.push(s.pop()*s.pop());
            }else if(ch.equals("/")){
                int val1=s.pop();
                int val2=s.pop();
                s.push(val2/val1);
            
            }else{
                s.push(Integer.parseInt(ch));
            }
        }

        return s.peek();
        
        
    }
}
