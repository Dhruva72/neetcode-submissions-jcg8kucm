class Solution {
    public int evalRPN(String[] tokens) {
      int res = 0;
      Stack<Integer> stack = new Stack<>();
      for(String s : tokens){
         if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                if(s.equals("+")){
                    int a = stack.pop();
                    int b = stack.pop();
                    res = stack.push(a+b);
                }
                else if(s.equals("-")){
                    int a = stack.pop();
                    int b = stack.pop();
                    res = stack.push(a-b);
                }
                else if(s.equals("*")){
                    int a = stack.pop();
                    int b = stack.pop();
                    res = stack.push(a*b);
                }
                else if(s.equals("/")){
                    int a = stack.pop();
                    int b = stack.pop();
                    res = stack.push(a/b);
                }
         }
         else{
            stack.push(Integer.parseInt(s));
         }
      }  
      return res;
    }
}
