class Solution {
    public String reverseWords(String s) {
        String[] w=s.trim().split("\\s+");
        StringBuilder ss=new StringBuilder();
        for(int i=w.length-1;i>=0;i--)
        {
            ss.append(w[i]);
            if(i!=0)
            {
                ss.append(" ");
            }
        }
        return ss.toString();
    }
}