class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int res=0;
        while(l<r){
            int w=r-l;
            int minh=Math.min(height[l],height[r]);
            res=Math.max(res,minh*w);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}