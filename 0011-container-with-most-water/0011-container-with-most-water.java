class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int w=r-l;
            int h=Math.min(height[l],height[r]);
            int water=w*h;
            max=Math.max(water,max);
            if(height[l]<height[r]){
                l++;
            }
            else if(height[r]>height[l]){
                r--;
            }
            else{
                l++;
                r--;
            }
        }
        return max;
    }
}