class Solution {
    public int findClosestNumber(int[] nums) {
        int closest=Math.abs(nums[0]);
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int current=Math.abs(nums[i]);
            if(current<closest){
                closest=current;
                result=nums[i];
            }
            else if(closest==current){
                result=Math.max(nums[i],result);
            }
        }
        return result;
    }
}