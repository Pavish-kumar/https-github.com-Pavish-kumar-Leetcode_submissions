class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        String operators="+ - * /";
        for(String s:tokens){
            if(operators.contains(s)){
                int b=stack.pop();
                int a=stack.pop();
                int val=0;
                switch(s){
                    case "+":
                    val=a+b;
                    break;
                    case "-":
                    val=a-b;
                    break;
                    case "*":
                    val=a*b;
                    break;
                    case "/":
                    val=a/b;
                    break;
                }
                stack.push(val);
            }
            else{
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}