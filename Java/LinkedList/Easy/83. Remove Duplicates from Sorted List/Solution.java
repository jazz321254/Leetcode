/**
 * <pre> 
 * 將head給一個list去判斷若下個值等於這個值 
 * 就把下個下個值給下一個當值 依續往下
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while(list != null){
            if(list.next == null) break;
            if(list.val == list.next.val)
                list.next = list.next.next;
            else
                list = list.next;
        }
        return head;
    }
}
