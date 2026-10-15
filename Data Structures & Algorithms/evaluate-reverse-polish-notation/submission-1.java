class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> stack = new Stack<>();
      for(String s : tokens){
         if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                if(s.equals("+")){
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a+b);
                }
                else if(s.equals("-")){
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(b-a);
                }
                else if(s.equals("*")){
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a*b);
                }
                else if(s.equals("/")){
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(b/a);
                }
         }
         else{
            stack.push(Integer.parseInt(s));
         }
      }  
      return stack.pop();
    }
}
