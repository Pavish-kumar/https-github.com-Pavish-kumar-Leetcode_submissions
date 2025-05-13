class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
        for(int n:stones){
            maxHeap.offer(n);
        }
        while(maxHeap.size()>1){
            int l1=maxHeap.poll();
            int l2=maxHeap.poll();
            if(l1!=l2){
                maxHeap.offer(l1-l2);
            }
        }
    return maxHeap.isEmpty()?0:maxHeap.peek();
    }
}