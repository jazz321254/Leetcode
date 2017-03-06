/**
 * <pre> 
 * 先算出兩個list差異 
 * 將多出來的刪除 在比較兩個list是否有相等
 * 
 * </pre>
 *
 * @author Shawn
 */
 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int diff = diffLen(headA, headB);
        // 將多餘的list去掉
        if(diff > 0){
            while(diff > 0){
                headA = headA.next;
                diff--;
            }   
        }else{
            while(diff < 0){
                headB = headB.next;
                diff++;
            }
        }
        // 比較兩個list
        while(headA != null){
            if(headA.val == headB.val) return headA;
            headA = headA.next;
            headB = headB.next;
        }    
        return null;
    }
    
    public int diffLen(ListNode headA, ListNode headB){
        int aLen = 0, bLen = 0;
        while(headA != null){
            headA = headA.next;
            aLen++;
        }
        while(headB != null){
            headB = headB.next;
            bLen++;
        }
        return aLen - bLen;
    }
}
