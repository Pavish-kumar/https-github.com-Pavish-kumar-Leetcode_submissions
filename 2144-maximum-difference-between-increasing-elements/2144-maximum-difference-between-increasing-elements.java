class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int max_diff=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>min){
                max_diff=Math.max(max_diff,nums[i]-min);
            }
            else{
                min=nums[i];
            }
        }
        return max_diff;
    }
}