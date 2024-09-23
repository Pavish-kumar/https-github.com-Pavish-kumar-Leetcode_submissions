class Solution {
    private int nums[];
    private Random r;
    public Solution(int[] nums) {
        this.nums=nums;
        this.r=new Random();
    }
    
    public int pick(int target) {
       while(true)
       {
            int i=r.nextInt(nums.length);
            if(nums[i]==target)
            {
                return i;
            }
       }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */