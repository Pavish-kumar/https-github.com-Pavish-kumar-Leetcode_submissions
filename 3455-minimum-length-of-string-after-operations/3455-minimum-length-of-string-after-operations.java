class Solution {
    public int minimumLength(String s) {
        int[] charFreq=new int[26];
        for(char c:s.toCharArray()){
            charFreq[c-'a']++;
        }
        int total=0;
        for(int c:charFreq){
            if(c==0){
                continue;
            }
            if(c%2==0){
                total+=2;
            }
            else{
                total+=1;
            }
        }
        return total;
    }
}