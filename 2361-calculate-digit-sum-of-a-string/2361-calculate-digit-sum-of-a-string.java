class Solution {
    public String digitSum(String s, int k) {
        int temp;
        StringBuilder st=new StringBuilder();
        while(s.length()>k){
            st.setLength(0);
            for(int i=0;i<s.length();i+=k){
                temp=0;
                for(int j=i;j<i+k&&j<s.length();j++){
                    temp+=s.charAt(j)-'0';
                }
                st.append(temp);
            }
            s=st.toString();
        }
        return s;
    }
}