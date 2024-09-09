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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        ListNode curr = head;
        int startRow = 0;
        int endRow = m - 1;
        int startCol = 0;
        int endCol = n - 1;
        int [][] arr = new int[m][n];
        while(startCol <= endCol && startRow <= endRow){
            //top
            for(int i = startCol; i <= endCol; i++){
                if(curr == null)
                    arr[startRow][i] = -1;
                else{
                    arr[startRow][i] = curr.val;
                    curr = curr.next;
                }
            }
            //right
            for(int i = startRow + 1; i <= endRow; i++){
                if(curr == null)
                    arr[i][endCol] = -1;
                else{
                    arr[i][endCol] = curr.val;
                    curr = curr.next;
                }
            }
            //bottom
            for(int i = endCol - 1; i >= startCol; i--){
                if(startRow == endRow)
                    break;
                if(curr == null)
                    arr[endRow][i] = -1;
                else{
                    arr[endRow][i] = curr.val;
                    curr = curr.next;
                }
            }
            //left
            for(int i = endRow - 1; i >= startCol + 1; i--){
                if(startCol == endCol)
                    break;
                if(curr == null)
                    arr[i][startCol] = -1;
                else{
                    arr[i][startCol] = curr.val;
                    curr = curr.next;
                }
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return arr;
    }
}