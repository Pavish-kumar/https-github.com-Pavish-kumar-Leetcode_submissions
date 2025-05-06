class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(0,nums.length,nums,list,res);
        return res;
    }
    public void helper(int i,int n,int[] arr,List<Integer> list,List<List<Integer>> res){
        if(i>=n){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        helper(i+1,arr.length,arr, list,res);
        list.remove(list.size()-1);
        helper(i+1,arr.length,arr,list,res);
    }
}