class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(1,n,k,list,res);
        return res;
    }
    public void helper(int st,int en,int k,List<Integer> list,List<List<Integer>> res){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
        }
        for(int i=st;i<=en;i++){
            list.add(i);
            helper(i+1,en,k,list,res);
            list.remove(list.size()-1);
        }
    }
}