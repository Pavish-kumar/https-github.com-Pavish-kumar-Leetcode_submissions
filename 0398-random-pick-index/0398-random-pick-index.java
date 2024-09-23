class Solution {
    private int nums[];
    private Random r;
    public Solution(int[] nums) {
        this.nums=nums;
        this.r=new Random();
    }
    
    public int pick(int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                list.add(i);
            }
        }
        if(list.size()>0)
        {
            return list.get(r.nextInt(list.size()));
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */