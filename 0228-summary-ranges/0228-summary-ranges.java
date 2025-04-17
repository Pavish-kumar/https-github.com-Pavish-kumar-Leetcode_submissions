class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        int len=nums.length,i=0;
        while(i<len){
            int start=nums[i];
            while(i<len-1&&nums[i+1]==nums[i]+1){
                i++;
            }
            if(nums[i]!=start){
                 res.add(new String(start+"->"+nums[i]));
            }
            else{
                res.add(new String(Integer.toString(start)));
            }
            i+=1;
        }
        return res;
    }
}