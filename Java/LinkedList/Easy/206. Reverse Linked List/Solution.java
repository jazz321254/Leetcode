/**
 * <pre> 
 * 解題關鍵
 * 新增一個list從尾端一個一個加上去
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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode newhead = null;
        while(head != null){
            // 先暫存住下一個node
            ListNode next = head.next;
            // 從尾端開始組reverse list
            head.next = newhead;
            newhead = head;
            // head往下一個node繼續走
            head = next;
        }
        return newhead;
    }
}
