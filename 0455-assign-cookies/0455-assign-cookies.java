class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res=0,i=0,j=0;
        int gs=g.length,ss=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<gs&&j<ss){
            if(g[i]<=s[j]){
                i++;
                j++;
                res++;
            }
            else{
                j++;
            }
        }
        return res;
    }
}