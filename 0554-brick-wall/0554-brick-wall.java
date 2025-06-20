class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=wall.size();
        int max=0;
        for(int i=0;i<n;i++){
            int pre=0;
            for(int j=0;j<wall.get(i).size()-1;j++){
                pre+=wall.get(i).get(j);
                map.put(pre,map.getOrDefault(pre,0)+1);
                max=Math.max(max,map.get(pre));
            }
        }
        return n-max;


    }
}