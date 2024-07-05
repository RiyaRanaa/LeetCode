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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min_distance=Integer.MAX_VALUE;
        int first_ma_index=-1;
        int prev_ma_index=-1;
        int index=1;
        ListNode prev = head;
        ListNode curr = head.next;

        while(curr.next!=null){
            if(curr.val> prev.val && curr.val > curr.next.val || curr.val < prev.val && curr.val< curr.next.val){
                if (first_ma_index ==-1){
                    first_ma_index=index;
                }
                if(prev_ma_index != -1){
                    min_distance=Math.min(min_distance,index - prev_ma_index);
                }
                prev_ma_index=index;
                System.out.println("prev_ma_index:"+prev_ma_index);
            }
            prev=curr;
            curr=curr.next;
            ++index;
        }
        if(min_distance==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        return new int[]{min_distance, prev_ma_index - first_ma_index};
    }
}