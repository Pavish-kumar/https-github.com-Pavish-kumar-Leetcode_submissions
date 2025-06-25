class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        helper(res,list,nums,visited);
        return res;
    }
    public void helper(List<List<Integer>> res,List<Integer> list,int[] nums,boolean[] visited){
    if(list.size()==nums.length&&!res.contains(list)){
        res.add(new ArrayList<>(list));
    }
    for(int i=0;i<nums.length;i++){
        if(visited[i]){
            continue;
        }
        list.add(nums[i]);
        visited[i]=true;
        helper(res,list,nums,visited);
        list.remove(list.size()-1);
        visited[i]=false;
    }
    }
}