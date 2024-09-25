class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr=new int[256];
        int a=1;
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[(int)s.charAt(i)]==0)
            {
                arr[(int)s.charAt(i)] = (int)t.charAt(i);
            }
            if(arr[(int)s.charAt(i)]!=(int)t.charAt(i))
            {
                a=0;
                break;
            }
        }
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++)
        {
            if(arr[(int)t.charAt(i)]==0)
            {
                arr[(int)t.charAt(i)] = (int)s.charAt(i);
            }
            if(arr[(int)t.charAt(i)]!=(int)s.charAt(i))
            {
                a=0;
                break;
            }
        }
        if(a==0)
        {
            return false;
        }
        return true;
    }
}