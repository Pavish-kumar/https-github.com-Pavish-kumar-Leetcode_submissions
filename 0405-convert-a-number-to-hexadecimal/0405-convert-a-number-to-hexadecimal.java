class Solution {
    public String toHex(int num) {
        if(num==0)
        {
            return "0";
        }
        char[] s="0123456789abcdef".toCharArray();
        StringBuilder ss=new StringBuilder();
        while(num!=0)
        {
            int r=num&15;
            ss.append(s[r]);
            num>>>=4;
        }
        return ss.reverse().toString();
    }
}