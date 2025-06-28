class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int res=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                if(st.size()>0){
                    st.pop();
                }
            }
            res=Math.max(res,st.size());
        }
        return res;
    }
}