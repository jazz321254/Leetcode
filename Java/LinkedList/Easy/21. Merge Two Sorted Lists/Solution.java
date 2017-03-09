/**
 * <pre> 
 * 這是自己的解法 僅供參考 
 * 思路 先將長的list放前面 再一一比對 若是長list比較小就往下走 反之將短的插入長list中
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode longer = (calcuateLen(l1) >= calcuateLen(l2) ) ? l1 : l2;
        ListNode shorter = (calcuateLen(l1) >= calcuateLen(l2) ) ? l2 : l1;
        ListNode rs = longer;
        while(longer != null && shorter != null){
            if(longer.val < shorter.val){
                if(longer.next == null){
                   longer.next = shorter;
                   break;
                }
                longer = longer.next;
            }else{
                ListNode tmp = new ListNode(0);
                tmp.val = shorter.val;
                tmp.next = shorter.next;
                shorter.next = longer.next;
                longer.next = shorter;
                shorter.val = longer.val;
                longer.val = tmp.val;
                shorter = tmp.next;
                longer = longer.next;
            }
        }
        return rs;
    }
    
    public int calcuateLen(ListNode l1){
        int len = 0;
        while(l1 != null){
            l1 = l1.next;
            len++;
        }
        return len;
    }
}
