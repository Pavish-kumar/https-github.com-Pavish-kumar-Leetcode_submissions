class Solution {
    public boolean ispalin(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                ss.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return ispalin(ss.toString());
    }
}