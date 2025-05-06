class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        helper(nums,list,res,visited);
        return res;
    }
    public void helper(int[] nums,List<Integer> list,List<List<Integer>> res, boolean[] visited){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            list.add(nums[i]);
            visited[i]=true;
            helper(nums,list,res,visited);
            list.remove(list.size()-1);
            visited[i]=false;
        }
    }
}