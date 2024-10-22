class Solution {
    public ListNode middleNode(ListNode head) {
        int l=0;
        ListNode temp=head;
        ListNode temp1=temp;
        while(temp!=null)
        {
            l++;
            temp=temp.next;
        }
        if(l==1)
        {
            return head;
        }
        for(int i=0;i<l/2;i++)
        {
            temp1=temp1.next;
        }
        System.gc();
        return temp1;
    }
}