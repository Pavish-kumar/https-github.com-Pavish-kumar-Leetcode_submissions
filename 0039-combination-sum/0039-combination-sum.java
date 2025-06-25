class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(0,list,candidates,target,res);
        return res;
    }
    private void helper(int ind,List<Integer> list,int[] nums,int target,List<List<Integer>> res){
        if(ind==nums.length){
            if(target==0){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if(target>=nums[ind]){
            list.add(nums[ind]);
            helper(ind,list,nums,target-nums[ind],res);
            list.remove(list.size()-1);
        }
        helper(ind+1,list,nums,target,res);
    }
}