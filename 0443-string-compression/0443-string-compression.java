class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int c=0;
        int in=0;
        for(int i=0;i<n;)
        {
            c=0;
            char cu=chars[i];
            while(i<n&&cu==chars[i])
            {
                c++;
                i++;
            }
            chars[in++]=cu;
            if(c>1)
            {
                for(char x:String.valueOf(c).toCharArray())
                {
                    chars[in++]=x;
                }
            }
        }
        // System.gc();
        return in;
    }
}