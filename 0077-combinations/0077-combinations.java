class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(1,n,list,res,k);
        return res;
    }
    public void helper(int st,int n,List<Integer> list,List<List<Integer>> res,int k){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=st;i<=n;i++){
            list.add(i);
            helper(i+1,n,list,res,k);
            list.remove(list.size()-1);
        }
    }
}