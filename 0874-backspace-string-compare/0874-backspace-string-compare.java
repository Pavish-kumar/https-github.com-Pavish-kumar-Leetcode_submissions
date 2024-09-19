class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder ss=new StringBuilder();
        StringBuilder ss1=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#'&&ss.length()>0)
            {
                ss.deleteCharAt(ss.length()-1);
            }
            else if(s.charAt(i)!='#')
            {
                ss.append(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='#'&&ss1.length()>0)
            {
                ss1.deleteCharAt(ss1.length()-1);
            }
            else if(t.charAt(i)!='#')
            {
                ss1.append(t.charAt(i));
            }
        }
        return (ss.toString().equals(ss1.toString()));
    }
}