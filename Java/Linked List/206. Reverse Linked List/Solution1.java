/**
 * <pre> 
 * 根據solution調整成尾遞歸解法 解答厲害～
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
public class Solution1 {
    public ListNode reverseList(ListNode head) {
        return recursiveList(head, null);
    }
    
    public ListNode recursiveList(ListNode head, ListNode newhead){
        if(head == null) return newhead;
        ListNode next = head.next;
        head.next = newhead;
        return recursiveList(next, head);
    }
}
