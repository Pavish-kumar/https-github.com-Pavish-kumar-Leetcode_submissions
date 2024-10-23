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
    public ListNode removeNodes(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode temp=head;
        ListNode nx=removeNodes(temp.next);
        temp.next=nx;
        if(nx==null||temp.val>=nx.val)
        {
            return temp;
        }
        return nx;
    }
}