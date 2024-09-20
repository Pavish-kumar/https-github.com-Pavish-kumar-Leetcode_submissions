class Solution {
    public int xorOperation(int n, int start) {
        int m=(start+2*0);
        int res=1;
        for(int i=1;i<n;i++)
        {
            m^=(start+2*i);
        }
        return m;
    }

}