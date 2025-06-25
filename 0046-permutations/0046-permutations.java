class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        helper(nums,res,list,visited);
        return res;
    }
    private void helper(int[] nums,List<List<Integer>> res,List<Integer> list,boolean[] visited){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            list.add(nums[i]);
            visited[i]=true;
            helper(nums,res,list,visited);
            list.remove(list.size()-1);
            visited[i]=false;
        }
    }
}