class Solution {
    public int trap(int[] height) {
        int[] hl=new int[height.length];
        int[] hr=new int[height.length];
        int res=0;
        int lmax=height[0];
        int rmax=height[height.length-1];
        for(int i=0;i<height.length;i++){
            lmax=Math.max(lmax,height[i]);
            hl[i]=lmax;
            rmax=Math.max(rmax,height[height.length-i-1]);
            hr[height.length-i-1]=rmax;
        }
        for(int i=0;i<height.length;i++){
            int p=Math.min(hl[i],hr[i]);
            res+=Math.max(0,p-height[i]);
        }
        return res;
    }
}