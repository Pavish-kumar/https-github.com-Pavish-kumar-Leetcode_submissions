/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int c=1;
        ListNode head1=head;
        ListNode temp=head;
        ListNode temp1=head;
        if(head==null||head.next==null)
        {
            return head;
        }
        while(temp.next!=null)
        {
            c++;
            temp=temp.next;
        }
        k=k%c;
        if(k==0)
        {
            return head;
        }
        for(int i=0;i<(c-k)-1;i++)
        {
            temp1=temp1.next;
        }
        head=temp1.next;
        temp1.next=null;
        temp.next=head1;
        return head;
    }
}