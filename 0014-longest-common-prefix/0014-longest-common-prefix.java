class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(result.toString())!=0){
                result.setLength(result.length()-1);
            }
        }
        return result.toString();
    }
}