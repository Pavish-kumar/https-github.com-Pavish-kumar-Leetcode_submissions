class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lm=height[l];
        int rm=height[r];
        int w=0;
        while(l<r)
        {
            if(lm<rm)
            {
                l+=1;
                lm=Math.max(lm,height[l]);
                w=w+lm-height[l];
            }
            else
            {
                r--;
                rm=Math.max(rm,height[r]);
                w=w+rm-height[r];
            }
        }
        return w;
    }
}