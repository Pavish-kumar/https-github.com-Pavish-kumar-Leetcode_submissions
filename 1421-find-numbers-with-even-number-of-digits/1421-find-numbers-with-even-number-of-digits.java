class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i:nums){
            String str=Integer.toString(i);
            if(str.length()%2==0){
                res+=1;
            }
        }
        return res;
    }
}