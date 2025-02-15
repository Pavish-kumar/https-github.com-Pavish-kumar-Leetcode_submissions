class Solution {
    public int punishmentNumber(int n) {
        int punishmentNum=0;
        for(int i=1;i<=n;i++){
            int sq=i*i;
            if(isPartionable(sq,i)){
                punishmentNum+=sq;
            }
        }
        return punishmentNum;
    }
    public boolean isPartionable(int sq,int i){
        if(sq<i||i<0){
            return false;
        }
        if(i==sq){
            return true;
        }
        return isPartionable(sq/10,i-(sq%10))||isPartionable(sq/100,i-(sq%100))||isPartionable(sq/1000,i-(sq%1000));
    }
}