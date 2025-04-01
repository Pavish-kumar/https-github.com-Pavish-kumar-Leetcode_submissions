class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(result,list,candidates,0,target);
        return result;
    }
    public void helper(List<List<Integer>> result,List<Integer> list,int[] candidates,int index, int target){
        if(target<0||index>=candidates.length){
            return ;
        }
        if(target==0&&!result.contains(list)){
             result.add(new ArrayList<>(list));
             return;
        }
        list.add(candidates[index]);
        helper(result,list,candidates,index,target-candidates[index]);
        list.remove(list.size()-1);
        helper(result,list,candidates,index+1,target);
    }
}