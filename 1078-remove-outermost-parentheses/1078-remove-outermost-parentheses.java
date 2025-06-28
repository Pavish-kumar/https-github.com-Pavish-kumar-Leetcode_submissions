class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(st.size()>0){
                    ss.append(s.charAt(i));
                }
                st.push(c);
            }
            else {
                st.pop();
                if(st.size()>0){
                    ss.append(c);
                }
            }
        }
        return ss.toString();
    }
}