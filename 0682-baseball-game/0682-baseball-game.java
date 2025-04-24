class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int res=0;
        for(String s:operations){
            switch(s){
                case "C":
                if(!stack.isEmpty()){
                    stack.pop();
                }
                break;
                case "D":
                stack.push(stack.peek()*2);
                break;
                case "+":
                if(stack.size()>=2){
                    int temp=stack.pop();
                    int temp1=temp+stack.peek();
                    stack.push(temp);
                    stack.push(temp1);
                }
                break;
                default:
                stack.push(Integer.valueOf(s));
            }
        }
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}