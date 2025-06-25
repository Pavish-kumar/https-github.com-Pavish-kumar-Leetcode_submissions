class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(0,list,candidates,target,res);
        return res;
    }
    private void helper(int ind,List<Integer> list,int[] nums,int target,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            if(target>=nums[i]){
                list.add(nums[i]);
                helper(i,list,nums,target-nums[i],res);
                list.remove(list.size()-1);
            }
        }
    }
}