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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean solve(ListNode ll, TreeNode root) {
        if (ll == null) {
            return true;
        }
        if (root == null || root.val != ll.val) {
            return false;
        }

        return solve(ll.next, root.left) || solve(ll.next, root.right);
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;

        return solve(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }
}