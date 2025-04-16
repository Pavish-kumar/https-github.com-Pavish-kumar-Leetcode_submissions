class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        int i=0,j=0;
        StringBuilder temp=new StringBuilder();
        while(i<len1&&j<len2){
            if(s.charAt(i)==t.charAt(j)){
                temp.append(t.charAt(j));
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return s.equals(temp.toString());
    }
}