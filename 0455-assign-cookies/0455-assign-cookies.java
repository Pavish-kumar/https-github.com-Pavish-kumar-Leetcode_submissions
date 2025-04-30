class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res=0,i=0,j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length&&j<s.length){
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