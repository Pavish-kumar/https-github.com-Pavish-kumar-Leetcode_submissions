/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode temp1=head;
        while(temp1!=null&&temp1.next!=null){
            temp1=temp1.next.next;
            temp=temp.next;
            if(temp==temp1){
                return true;
            }
        }
        return false;
    }
}