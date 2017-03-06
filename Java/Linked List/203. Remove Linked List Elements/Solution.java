/**
 * <pre> 
 * 先把前面相同的刪除 
 * 再判斷剩下的節點地下一個是否相等
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode list = head;
        if(head == null) return null;
        while(head != null && head.val == val){
            head = head.next;
        }
        while(list != null){
            if(list.next == null) break;
            if(val == list.next.val)
                list.next = list.next.next;
            else 
                list = list.next;
        }
        return head;
    }
}
