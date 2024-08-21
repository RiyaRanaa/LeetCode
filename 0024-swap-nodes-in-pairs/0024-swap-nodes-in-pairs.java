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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0); 
        dummy.next=head;
        ListNode dummy_point=dummy;

        while(dummy_point.next != null && dummy_point.next.next != null){
            ListNode swap1=dummy_point.next;
            ListNode swap2=dummy_point.next.next;

            swap1.next=swap2.next;
            swap2.next=swap1;
            dummy_point.next=swap2;

            dummy_point=swap1;
        }
        return dummy.next;
    }
}