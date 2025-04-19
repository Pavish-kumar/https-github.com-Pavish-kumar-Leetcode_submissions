class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0){
            return new int[][]{};
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> list=new LinkedList<>();
        int element[]=intervals[0];
        for(int i=0;i<intervals.length;i++){
            int comp[]=intervals[i];
            if(element[1]>=comp[0]){
                element[1]=Math.max(comp[1],element[1]);
            }
            else{
                list.add(element);
                element=comp;
            }
        }
        list.add(element);
        return list.toArray(new int[list.size()][]);
    }
}