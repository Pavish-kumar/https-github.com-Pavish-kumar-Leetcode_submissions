class Solution {
    public boolean isWorking(int k,int[] piles,int h){
        int temp=0;
        for(int pile:piles){
            temp+=(int)Math.ceil((double)pile/k);
        }
        return temp<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        while(l<r){
            int mid=(l+r)/2;
            if(isWorking(mid,piles,h)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return r;
    }
}