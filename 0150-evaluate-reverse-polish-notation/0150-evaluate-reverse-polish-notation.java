class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i < tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")){
                int i1 = st.pop();
                int i2 = st.pop();
                int data = evaluate(i1, i2, tokens[i]);
                st.push(data);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
    
        private int evaluate(int i1,int i2,String operator){
            if(operator.equals("+")){
                return i1 + i2;
            }else if(operator.equals("*")){
                return i1 * i2;
            }else if(operator.equals("/")){
                return i2 / i1; 
            }else{
                return i2 - i1;
            }
        }
}