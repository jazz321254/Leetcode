/**
 * <pre> 
 * 將要刪除的節點下一個值給他自己 
 * 並將刪除的解點下下個解點的位置給他自己即可
 * </pre>
 *
 * @author Shawn
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
