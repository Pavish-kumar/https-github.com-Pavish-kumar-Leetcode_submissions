class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0;
        int min=Integer.MAX_VALUE;
        int cval=0;
        while(right<nums.length){
            if(cval<target){
                cval+=nums[right++];
            }
            while(cval>=target){
                cval-=nums[left++];
                min=Math.min(min,right-left+1);
            }
        }
        return min!=Integer.MAX_VALUE?min:0;
    }
}