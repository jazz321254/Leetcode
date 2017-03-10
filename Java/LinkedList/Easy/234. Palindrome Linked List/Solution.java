/**
 * <pre> 
 * 解題思路 分基數偶數去做一半的reverse list 再下去比對是否相等 
 * PS:本方法是先取list長度去判斷基偶 也有人用雙list一個每次跑一步一個跑兩步去分基偶
 * 時間複雜度 O(n) 空間複雜度是不可能O(1) 因為光最reverse list就需要O(n)
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
    public boolean isPalindrome(ListNode head) {
        ListNode newhead = null;
        int len = checkLen(head);
        int count = 0;
        // 分為基數與偶數
        if(len % 2 == 0){
            while(count < len/2 && head != null ){
                ListNode next = head.next;
                head.next = newhead;
                newhead = head;
                head = next;
                count++;
            } 
        }else{
            while(count < Math.floor(len/2) && head != null ){
                ListNode next = head.next;
                head.next = newhead;
                newhead = head;
                head = next;
                count++;
            }
            // 基數需再多往下走一步
            head = head.next;
        }
        
        while(head != null){
            if(head.val != newhead.val) return false;
            head = head.next;
            newhead = newhead.next;
        }
        return true;
    }
    
    public int checkLen(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}
