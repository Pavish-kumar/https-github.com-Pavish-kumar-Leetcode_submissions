class Solution {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int maxJump=0,lastjump=0;
        int jump=0;
        for(int i=0;i<nums.length-1;i++){
            maxJump=Math.max(maxJump,nums[i]+i);
            if(i==lastjump){
                lastjump=maxJump;
                jump++;
                if(lastjump>=nums.length-1){
                    break;
                }
            }
        }
        return jump;
    }
}