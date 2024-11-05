class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] out=new int[n+1];
        int[] ind=new int[n+1];
        if(n==1){return 1;}
        for(int i=0;i<trust.length;i++){
            out[trust[i][0]]++;
            ind[trust[i][1]]++;}
        for(int i=0;i<=n;i++){
            if(out[i]==0&&ind[i]==n-1){   return i;}}
        return -1;}
}