class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        helper(n,res,0,0,"");
        return res;
    }
    public void helper(int n,List<String> list,int op,int cp,String temp){
        if(op==cp&&op+cp==n*2){
            list.add(temp);
            return;
        }
        if(op<n){
            helper(n,list,op+1,cp,temp+"(");
        }
        if(cp<op){
            helper(n,list,op,cp+1,temp+")");
        }
    }
}