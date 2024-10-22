class Solution {
    public int getDecimalValue(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null)
        {
            n*=2;
            n+=temp.val;
            temp=temp.next;
        }
        return n;
    }
}