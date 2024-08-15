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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        // find middle of LL
        ListNode slow=head, fast=head;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse 2nd half of LL
        ListNode prev=null;
        while(slow !=null){
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        //compare 1st halt & reversed 2nd half
        ListNode left=head, right=prev;
        while(right !=null){
            if(left.val != right.val) return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }
}