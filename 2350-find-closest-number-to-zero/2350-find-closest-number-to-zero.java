class Solution {
    public int findClosestNumber(int[] nums) {
        int closestNumber=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(closestNumber)){
                closestNumber=Math.abs(nums[i]);
                result=nums[i];
            }
            else if(Math.abs(nums[i])==Math.abs(closestNumber)){
                closestNumber=Math.max(nums[i],closestNumber);
                result=closestNumber;
            }
        }
        return result;
    }
}